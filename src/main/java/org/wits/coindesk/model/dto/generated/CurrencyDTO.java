package org.wits.coindesk.model.dto.generated;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CurrencyDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-18T10:45:48.977089100+08:00[Asia/Taipei]")
public class CurrencyDTO {

  @JsonProperty("oid")
  private Long oid;

  @JsonProperty("code")
  private String code;

  @JsonProperty("nameCht")
  private String nameCht;

  @JsonProperty("createdTimestamp")
  private Long createdTimestamp;

  @JsonProperty("updatedTimestamp")
  private Long updatedTimestamp;

  public CurrencyDTO oid(Long oid) {
    this.oid = oid;
    return this;
  }

  /**
   * Get oid
   * @return oid
  */
  
  @Schema(name = "oid", required = false)
  public Long getOid() {
    return oid;
  }

  public void setOid(Long oid) {
    this.oid = oid;
  }

  public CurrencyDTO code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  
  @Schema(name = "code", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CurrencyDTO nameCht(String nameCht) {
    this.nameCht = nameCht;
    return this;
  }

  /**
   * Get nameCht
   * @return nameCht
  */
  
  @Schema(name = "nameCht", required = false)
  public String getNameCht() {
    return nameCht;
  }

  public void setNameCht(String nameCht) {
    this.nameCht = nameCht;
  }

  public CurrencyDTO createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  /**
   * Get createdTimestamp
   * @return createdTimestamp
  */
  
  @Schema(name = "createdTimestamp", required = false)
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public CurrencyDTO updatedTimestamp(Long updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

  /**
   * Get updatedTimestamp
   * @return updatedTimestamp
  */
  
  @Schema(name = "updatedTimestamp", required = false)
  public Long getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  public void setUpdatedTimestamp(Long updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyDTO currencyDTO = (CurrencyDTO) o;
    return Objects.equals(this.oid, currencyDTO.oid) &&
        Objects.equals(this.code, currencyDTO.code) &&
        Objects.equals(this.nameCht, currencyDTO.nameCht) &&
        Objects.equals(this.createdTimestamp, currencyDTO.createdTimestamp) &&
        Objects.equals(this.updatedTimestamp, currencyDTO.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, code, nameCht, createdTimestamp, updatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyDTO {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    nameCht: ").append(toIndentedString(nameCht)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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

