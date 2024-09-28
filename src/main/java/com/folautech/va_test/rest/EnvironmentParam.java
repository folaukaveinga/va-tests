package com.folautech.va_test.rest;

public class EnvironmentParam {

    public static final String LOCAL = "local";
    public static final String PROD = "prod";
    public static String env = LOCAL;
    public static String customerEmail = "folaudev3@gmail.com";
    public static String driverEmail = "folaudev3@gmail.com";
    public static String password = "Folaukaveing@1234!";
    public static String jwtToken = null;

    public static String getApiUrl() {

        if(env==null || env.trim().isEmpty() || env.equals(LOCAL)) {
            return "http://localhost:8080/v1";
        } else if(env.equals(PROD)) {
            return "https://api.blip-delivery.com/v1";
        } else {
            return "http://localhost:8084/v1";
        }

    }
}
