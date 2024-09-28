package com.folautech.va_test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * API Response model that identifies a single individual created RONA Request
 */

public class RequestRONAResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private String requestId;

  private Long friendlyRequestId;

  private String ronaNumber;

  private String viewsNumber;

  private String trackingNumber;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate trackingSentDate;

  private String requesterName;

  private String addressLineOne;

  private String addressLineTwo;

  private String addressCity;

  private String addressState;

  private String addressZipcode;

  private String addressCountry;

  private Boolean printedList;

  private Boolean gummedLabel;

  private Boolean nationwideZipcode;

  @Valid
  private List<@Valid Zipcode> zipcodes = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDateOfDischarge;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endDateOfDischarge;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateSubmitted;

  public RequestRONAResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Request's Identification number
   * @return requestId
   */

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public RequestRONAResponse friendlyRequestId(Long friendlyRequestId) {
    this.friendlyRequestId = friendlyRequestId;
    return this;
  }

  /**
   * A friendly auto-increment unique number associated to a RONA request
   * @return friendlyRequestId
   */

  public Long getFriendlyRequestId() {
    return friendlyRequestId;
  }

  public void setFriendlyRequestId(Long friendlyRequestId) {
    this.friendlyRequestId = friendlyRequestId;
  }

  public RequestRONAResponse ronaNumber(String ronaNumber) {
    this.ronaNumber = ronaNumber;
    return this;
  }

  /**
   * Request's number
   * @return ronaNumber
   */

  public String getRonaNumber() {
    return ronaNumber;
  }

  public void setRonaNumber(String ronaNumber) {
    this.ronaNumber = ronaNumber;
  }

  public RequestRONAResponse viewsNumber(String viewsNumber) {
    this.viewsNumber = viewsNumber;
    return this;
  }

  /**
   * A number in the VIEWs application associated to a RONA request
   * @return viewsNumber
   */

  public String getViewsNumber() {
    return viewsNumber;
  }

  public void setViewsNumber(String viewsNumber) {
    this.viewsNumber = viewsNumber;
  }

  public RequestRONAResponse trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  /**
   * A shipping carrier tracking number for the physically mailed RONA output
   * @return trackingNumber
   */

  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public RequestRONAResponse trackingSentDate(LocalDate trackingSentDate) {
    this.trackingSentDate = trackingSentDate;
    return this;
  }

  /**
   * The date the printed RONA output was given to the shipping carrier to be mailed
   * @return trackingSentDate
   */

  public LocalDate getTrackingSentDate() {
    return trackingSentDate;
  }

  public void setTrackingSentDate(LocalDate trackingSentDate) {
    this.trackingSentDate = trackingSentDate;
  }

  public RequestRONAResponse requesterName(String requesterName) {
    this.requesterName = requesterName;
    return this;
  }

  /**
   * The name of the requester / entity submitting a RONA request
   * @return requesterName
   */
  

  public String getRequesterName() {
    return requesterName;
  }

  public void setRequesterName(String requesterName) {
    this.requesterName = requesterName;
  }

  public RequestRONAResponse addressLineOne(String addressLineOne) {
    this.addressLineOne = addressLineOne;
    return this;
  }

  /**
   * Request's address' first line
   * @return addressLineOne
   */

  public String getAddressLineOne() {
    return addressLineOne;
  }

  public void setAddressLineOne(String addressLineOne) {
    this.addressLineOne = addressLineOne;
  }

  public RequestRONAResponse addressLineTwo(String addressLineTwo) {
    this.addressLineTwo = addressLineTwo;
    return this;
  }

  /**
   * Request's address' second line
   * @return addressLineTwo
   */

  public String getAddressLineTwo() {
    return addressLineTwo;
  }

  public void setAddressLineTwo(String addressLineTwo) {
    this.addressLineTwo = addressLineTwo;
  }

  public RequestRONAResponse addressCity(String addressCity) {
    this.addressCity = addressCity;
    return this;
  }

  /**
   * Request's address' city
   * @return addressCity
   */

  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public RequestRONAResponse addressState(String addressState) {
    this.addressState = addressState;
    return this;
  }

  /**
   * Request's address' state
   * @return addressState
   */
  public String getAddressState() {
    return addressState;
  }

  public void setAddressState(String addressState) {
    this.addressState = addressState;
  }

  public RequestRONAResponse addressZipcode(String addressZipcode) {
    this.addressZipcode = addressZipcode;
    return this;
  }

  /**
   * Request's address' zipcode
   * @return addressZipcode
   */

  public String getAddressZipcode() {
    return addressZipcode;
  }

  public void setAddressZipcode(String addressZipcode) {
    this.addressZipcode = addressZipcode;
  }

  public RequestRONAResponse addressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

  /**
   * Request's address' country
   * @return addressCountry
   */

  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public RequestRONAResponse printedList(Boolean printedList) {
    this.printedList = printedList;
    return this;
  }

  /**
   * Request's printed list output format
   * @return printedList
   */

  public Boolean getPrintedList() {
    return printedList;
  }

  public void setPrintedList(Boolean printedList) {
    this.printedList = printedList;
  }

  public RequestRONAResponse gummedLabel(Boolean gummedLabel) {
    this.gummedLabel = gummedLabel;
    return this;
  }

  /**
   * Request's gummed labels output format
   * @return gummedLabel
   */

  public Boolean getGummedLabel() {
    return gummedLabel;
  }

  public void setGummedLabel(Boolean gummedLabel) {
    this.gummedLabel = gummedLabel;
  }

  public RequestRONAResponse nationwideZipcode(Boolean nationwideZipcode) {
    this.nationwideZipcode = nationwideZipcode;
    return this;
  }

  /**
   * Request's nationwide zipcode check
   * @return nationwideZipcode
   */

  public Boolean getNationwideZipcode() {
    return nationwideZipcode;
  }

  public void setNationwideZipcode(Boolean nationwideZipcode) {
    this.nationwideZipcode = nationwideZipcode;
  }

  public RequestRONAResponse zipcodes(List<@Valid Zipcode> zipcodes) {
    this.zipcodes = zipcodes;
    return this;
  }

  public RequestRONAResponse addZipcodesItem(Zipcode zipcodesItem) {
    if (this.zipcodes == null) {
      this.zipcodes = new ArrayList<>();
    }
    this.zipcodes.add(zipcodesItem);
    return this;
  }

  /**
   * Get zipcodes
   * @return zipcodes
   */

  public List<@Valid Zipcode> getZipcodes() {
    return zipcodes;
  }

  public void setZipcodes(List<@Valid Zipcode> zipcodes) {
    this.zipcodes = zipcodes;
  }

  public RequestRONAResponse startDateOfDischarge(LocalDate startDateOfDischarge) {
    this.startDateOfDischarge = startDateOfDischarge;
    return this;
  }

  /**
   * Request's start date of discharge
   * @return startDateOfDischarge
   */

  public LocalDate getStartDateOfDischarge() {
    return startDateOfDischarge;
  }

  public void setStartDateOfDischarge(LocalDate startDateOfDischarge) {
    this.startDateOfDischarge = startDateOfDischarge;
  }

  public RequestRONAResponse endDateOfDischarge(LocalDate endDateOfDischarge) {
    this.endDateOfDischarge = endDateOfDischarge;
    return this;
  }

  /**
   * Request's end date of discharge
   * @return endDateOfDischarge
   */

  public LocalDate getEndDateOfDischarge() {
    return endDateOfDischarge;
  }

  public void setEndDateOfDischarge(LocalDate endDateOfDischarge) {
    this.endDateOfDischarge = endDateOfDischarge;
  }

  public RequestRONAResponse dateSubmitted(LocalDate dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
    return this;
  }

  /**
   * Date the request was submitted
   * @return dateSubmitted
   */

  public LocalDate getDateSubmitted() {
    return dateSubmitted;
  }

  public void setDateSubmitted(LocalDate dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestRONAResponse requestRONAResponse = (RequestRONAResponse) o;
    return Objects.equals(this.requestId, requestRONAResponse.requestId) &&
        Objects.equals(this.friendlyRequestId, requestRONAResponse.friendlyRequestId) &&
        Objects.equals(this.ronaNumber, requestRONAResponse.ronaNumber) &&
        Objects.equals(this.viewsNumber, requestRONAResponse.viewsNumber) &&
        Objects.equals(this.trackingNumber, requestRONAResponse.trackingNumber) &&
        Objects.equals(this.trackingSentDate, requestRONAResponse.trackingSentDate) &&
        Objects.equals(this.requesterName, requestRONAResponse.requesterName) &&
        Objects.equals(this.addressLineOne, requestRONAResponse.addressLineOne) &&
        Objects.equals(this.addressLineTwo, requestRONAResponse.addressLineTwo) &&
        Objects.equals(this.addressCity, requestRONAResponse.addressCity) &&
        Objects.equals(this.addressState, requestRONAResponse.addressState) &&
        Objects.equals(this.addressZipcode, requestRONAResponse.addressZipcode) &&
        Objects.equals(this.addressCountry, requestRONAResponse.addressCountry) &&
        Objects.equals(this.printedList, requestRONAResponse.printedList) &&
        Objects.equals(this.gummedLabel, requestRONAResponse.gummedLabel) &&
        Objects.equals(this.nationwideZipcode, requestRONAResponse.nationwideZipcode) &&
        Objects.equals(this.zipcodes, requestRONAResponse.zipcodes) &&
        Objects.equals(this.startDateOfDischarge, requestRONAResponse.startDateOfDischarge) &&
        Objects.equals(this.endDateOfDischarge, requestRONAResponse.endDateOfDischarge) &&
        Objects.equals(this.dateSubmitted, requestRONAResponse.dateSubmitted) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, friendlyRequestId, ronaNumber, viewsNumber, trackingNumber, trackingSentDate, requesterName, addressLineOne, addressLineTwo, addressCity, addressState, addressZipcode, addressCountry, printedList, gummedLabel, nationwideZipcode, zipcodes, startDateOfDischarge, endDateOfDischarge, dateSubmitted, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestRONAResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    friendlyRequestId: ").append(toIndentedString(friendlyRequestId)).append("\n");
    sb.append("    ronaNumber: ").append(toIndentedString(ronaNumber)).append("\n");
    sb.append("    viewsNumber: ").append(toIndentedString(viewsNumber)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    trackingSentDate: ").append(toIndentedString(trackingSentDate)).append("\n");
    sb.append("    requesterName: ").append(toIndentedString(requesterName)).append("\n");
    sb.append("    addressLineOne: ").append(toIndentedString(addressLineOne)).append("\n");
    sb.append("    addressLineTwo: ").append(toIndentedString(addressLineTwo)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
    sb.append("    addressZipcode: ").append(toIndentedString(addressZipcode)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    printedList: ").append(toIndentedString(printedList)).append("\n");
    sb.append("    gummedLabel: ").append(toIndentedString(gummedLabel)).append("\n");
    sb.append("    nationwideZipcode: ").append(toIndentedString(nationwideZipcode)).append("\n");
    sb.append("    zipcodes: ").append(toIndentedString(zipcodes)).append("\n");
    sb.append("    startDateOfDischarge: ").append(toIndentedString(startDateOfDischarge)).append("\n");
    sb.append("    endDateOfDischarge: ").append(toIndentedString(endDateOfDischarge)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

