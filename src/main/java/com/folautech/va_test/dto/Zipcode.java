package com.folautech.va_test.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * Model that identifies a single zipcode
 */

public class Zipcode implements Serializable {

  private static final long serialVersionUID = 1L;

  private String zipcode;

  public Zipcode zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zipcode zipcode = (Zipcode) o;
    return Objects.equals(this.zipcode, zipcode.zipcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zipcode {\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
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

