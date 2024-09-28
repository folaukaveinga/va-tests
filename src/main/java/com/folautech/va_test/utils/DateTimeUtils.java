package com.folautech.va_test.utils;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface DateTimeUtils {

    public static boolean isStockMarketOpen() {
        return isStockMarketOpen(Clock.system(ZoneId.of("America/Denver")));
    }

    public static boolean isStockMarketOpen(Clock clock) {

        // Set the time zone to Eastern Time (ET)
//        ZoneId etTimeZone = ZoneId.of("America/Denver");

        // Get the current time in ET timezone
        LocalDateTime currentTime = LocalDateTime.now(clock);

        return isStockMarketOpen(currentTime);
    }

    public static boolean isStockMarketOpen(LocalDateTime currentTime) {
        System.out.println("currentTime: "+currentTime.toString());
        boolean isWeekend = currentTime.getDayOfWeek() == DayOfWeek.SATURDAY || currentTime.getDayOfWeek() == DayOfWeek.SUNDAY;

        if (isWeekend) {
            return false;
        }

        List<LocalDate> holidays = getStockMarketHolidays(currentTime.getYear());

        boolean isHoliday = holidays.contains(currentTime.toLocalDate());

        if (isHoliday) {
            return false;
        }

        // NYSE trading hours in MST timezone
        LocalTime nyseOpenTime = LocalTime.of(7, 30);
        LocalTime nyseCloseTime = LocalTime.of(14, 0);

        return isWithinTradingHours(currentTime.toLocalTime(), nyseOpenTime, nyseCloseTime);
    }

    private static boolean isWithinTradingHours(LocalTime timeNow, LocalTime marketOpen, LocalTime marketClose) {
        return !timeNow.isBefore(marketOpen) && !timeNow.isAfter(marketClose);
    }

    public static boolean isStockMarketClosing() {

        ZoneId etTimeZone = ZoneId.of("America/Denver");

        LocalTime nyseCloseSoon = LocalTime.of(13, 54);

        return LocalTime.now(etTimeZone).isAfter(nyseCloseSoon);
    }

    public static boolean isStockMarketOperationalToday(LocalDateTime dateTime) {
        return isStockMarketOperationalToday(dateTime.toLocalDate());
    }

    public static boolean isStockMarketOperationalToday(LocalDate today) {
        boolean isWeekend = today.getDayOfWeek() == DayOfWeek.SATURDAY || today.getDayOfWeek() == DayOfWeek.SUNDAY;
        if (isWeekend) {
            return false;
        }

        List<LocalDate> holidays = getStockMarketHolidays(today.getYear());

        return !holidays.contains(today);
    }

    /**
     * link to holidays: https://www.nasdaq.com/market-activity/stock-market-holiday-schedule
     */
    public static List<LocalDate> getStockMarketHolidays(int year) {
        List<LocalDate> holidays = new ArrayList<>();

        holidays.add(LocalDate.of(year, 1, 1)); // New Year's Day

        if (LocalDate.of(year, 1, 1).getDayOfWeek() == DayOfWeek.SUNDAY) {
            holidays.add(LocalDate.of(year, 1, 2)); // if New Year's Day is Sunday, Monday is a holiday
        }

        holidays.add(LocalDate.of(year, 1, 15).with(DayOfWeek.MONDAY)); // Martin Luther King Jr. Day
        holidays.add(LocalDate.of(year, 2, 15).with(DayOfWeek.MONDAY)); // Washington's Birthday

        holidays.add(LocalDate.of(year, 5, 31).with(DayOfWeek.MONDAY)); // Memorial Day

        holidays.add(LocalDate.of(year, 7, 4)); // Independence Day
        if (LocalDate.of(year, 7, 4).getDayOfWeek() == DayOfWeek.SATURDAY) {
            holidays.add(LocalDate.of(year, 7, 3)); // if Independence Day is Saturday, Friday is a holiday
        }
        if (LocalDate.of(year, 7, 4).getDayOfWeek() == DayOfWeek.SUNDAY) {
            holidays.add(LocalDate.of(year, 7, 5)); // if Independence Day is Sunday, Monday is a holiday
        }

        holidays.add(LocalDate.of(year, 9, 1).with(DayOfWeek.MONDAY)); // Labor Day

        holidays.add(LocalDate.of(year, 11, 1).with(DayOfWeek.THURSDAY).plusWeeks(3)); // Thanksgiving Day

        holidays.add(LocalDate.of(year, 12, 25)); // Christmas Day
        if (LocalDate.of(year, 12, 25).getDayOfWeek() == DayOfWeek.SATURDAY) {
            holidays.add(LocalDate.of(year, 12, 24)); // if Christmas Day is Saturday, Friday is a holiday
        }
        if (LocalDate.of(year, 12, 25).getDayOfWeek() == DayOfWeek.SUNDAY) {
            holidays.add(LocalDate.of(year, 12, 26)); // if Christmas Day is Sunday, Monday is a holiday
        }

        return holidays;
    }

    public static LocalDate getLatestStockMarketOperationalDay(LocalDateTime today) {
        return getLatestStockMarketOperationalDay(today.toLocalDate());
    }

    public static LocalDate getLatestStockMarketOperationalDay(LocalDate today) {
        LocalDate operationalDay = today;

        List<LocalDate> holidays = getStockMarketHolidays(operationalDay.getYear());

        boolean isWeekend = operationalDay.getDayOfWeek() == DayOfWeek.SATURDAY || operationalDay.getDayOfWeek() == DayOfWeek.SUNDAY;
        boolean isHoliday = holidays.contains(operationalDay);

        System.out.println("operationalDay=" + operationalDay.toString() + ", dayOfWeek=" + operationalDay.getDayOfWeek() + ", isWeekend=" + isWeekend + ", isHoliday=" + isHoliday);

        while (isWeekend || isHoliday) {

            operationalDay = operationalDay.minusDays(1);

            isWeekend = operationalDay.getDayOfWeek() == DayOfWeek.SATURDAY || operationalDay.getDayOfWeek() == DayOfWeek.SUNDAY;
            isHoliday = holidays.contains(operationalDay);

            System.out.println("operationalDay=" + operationalDay.toString() + ", dayOfWeek=" + operationalDay.getDayOfWeek() + ", isWeekend=" + isWeekend + ", isHoliday=" + isHoliday);

        }

        return operationalDay;
    }

    public static LocalDate getOptionNextFridayDate() {
        return getOptionNextFridayDate(LocalDate.now());
    }

    public static LocalDate getOptionNextAvailableDate(List<LocalDate> dates) {
        return getOptionNextAvailableDate(dates, LocalDate.now());
    }

    public static LocalDate getOptionNextAvailableDate(List<LocalDate> dates, LocalDate from) {

        if(dates == null || dates.size() <= 0){
            return null;
        }

        LocalDate today = from;

        LocalDate date = null;

        int numberOfDaysAway = 2;

        LocalDate minAvailableDate = today.plusDays(numberOfDaysAway);

        Optional<LocalDate> firstAvailableDate = dates.stream().filter(d -> {

            boolean result = d.isAfter(minAvailableDate) || d.isEqual(minAvailableDate);
            System.out.println("d: "+d+", minAvailableDate: "+minAvailableDate+", before: "+result);
            return result;
        }).findFirst();

        date = firstAvailableDate.orElse(null);

        return date;
    }

    public static LocalDate getOptionNextFridayDate(LocalDate today) {
        LocalDate nextFriday = null;

        if (Arrays.asList(DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY).contains(today.getDayOfWeek())) {
            nextFriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
            nextFriday = nextFriday.plusDays(7);
        } else {
            nextFriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        }

        return nextFriday;
    }

    private static boolean isWeekend(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

    private static boolean isHoliday(LocalDate date) {
        return getStockMarketHolidays(date.getYear()).contains(date);
    }

    public static LocalDate getLastTradingDateExcludingToday() {
        LocalDate yesterday = LocalDate.now(ZoneId.of("America/Denver")).minusDays(1);
        while (isWeekend(yesterday) || isHoliday(yesterday)) {
            yesterday = yesterday.minusDays(1);
        }
        return yesterday;
    }

    public static LocalDate getNextTradingDay() {
        LocalDate tomorrow = LocalDate.now(ZoneId.of("America/Denver")).plusDays(1);
        while (isWeekend(tomorrow) || isHoliday(tomorrow)) {
            tomorrow = tomorrow.plusDays(1);
        }
        return tomorrow;
    }

}
