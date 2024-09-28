package com.folautech.va_test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * API Request model that represents a single individual RONA request requesting to be created
 */

public class RequestRONARequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private String ronaNumber;

  private String viewsNumber;

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

  public RequestRONARequest ronaNumber(String ronaNumber) {
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

  public RequestRONARequest viewsNumber(String viewsNumber) {
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

  public RequestRONARequest requesterName(String requesterName) {
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

  public RequestRONARequest addressLineOne(String addressLineOne) {
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

  public RequestRONARequest addressLineTwo(String addressLineTwo) {
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

  public RequestRONARequest addressCity(String addressCity) {
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

  public RequestRONARequest addressState(String addressState) {
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

  public RequestRONARequest addressZipcode(String addressZipcode) {
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

  public RequestRONARequest addressCountry(String addressCountry) {
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

  public RequestRONARequest printedList(Boolean printedList) {
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

  public RequestRONARequest gummedLabel(Boolean gummedLabel) {
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

  public RequestRONARequest nationwideZipcode(Boolean nationwideZipcode) {
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

  public RequestRONARequest zipcodes(List<@Valid Zipcode> zipcodes) {
    this.zipcodes = zipcodes;
    return this;
  }

  public RequestRONARequest addZipcodesItem(Zipcode zipcodesItem) {
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

  public RequestRONARequest startDateOfDischarge(LocalDate startDateOfDischarge) {
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

  public RequestRONARequest endDateOfDischarge(LocalDate endDateOfDischarge) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestRONARequest requestRONARequest = (RequestRONARequest) o;
    return Objects.equals(this.ronaNumber, requestRONARequest.ronaNumber) &&
        Objects.equals(this.viewsNumber, requestRONARequest.viewsNumber) &&
        Objects.equals(this.requesterName, requestRONARequest.requesterName) &&
        Objects.equals(this.addressLineOne, requestRONARequest.addressLineOne) &&
        Objects.equals(this.addressLineTwo, requestRONARequest.addressLineTwo) &&
        Objects.equals(this.addressCity, requestRONARequest.addressCity) &&
        Objects.equals(this.addressState, requestRONARequest.addressState) &&
        Objects.equals(this.addressZipcode, requestRONARequest.addressZipcode) &&
        Objects.equals(this.addressCountry, requestRONARequest.addressCountry) &&
        Objects.equals(this.printedList, requestRONARequest.printedList) &&
        Objects.equals(this.gummedLabel, requestRONARequest.gummedLabel) &&
        Objects.equals(this.nationwideZipcode, requestRONARequest.nationwideZipcode) &&
        Objects.equals(this.zipcodes, requestRONARequest.zipcodes) &&
        Objects.equals(this.startDateOfDischarge, requestRONARequest.startDateOfDischarge) &&
        Objects.equals(this.endDateOfDischarge, requestRONARequest.endDateOfDischarge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ronaNumber, viewsNumber, requesterName, addressLineOne, addressLineTwo, addressCity, addressState, addressZipcode, addressCountry, printedList, gummedLabel, nationwideZipcode, zipcodes, startDateOfDischarge, endDateOfDischarge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestRONARequest {\n");
    sb.append("    ronaNumber: ").append(toIndentedString(ronaNumber)).append("\n");
    sb.append("    viewsNumber: ").append(toIndentedString(viewsNumber)).append("\n");
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

