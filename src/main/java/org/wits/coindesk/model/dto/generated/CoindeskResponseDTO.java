package org.wits.coindesk.model.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;

/**
 * 
 */

@Schema(name = "CoindeskResponseDTO", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-17T17:16:47.756762500+08:00[Asia/Taipei]")
public class CoindeskResponseDTO {

  @JsonProperty("time")
  private CoindeskResponseDTOTime time;

  @JsonProperty("disclaimer")
  private String disclaimer;

  @JsonProperty("chartName")
  private String chartName;

  @JsonProperty("bpi")
  private CoindeskResponseDTOBpi bpi;

  public CoindeskResponseDTO time(CoindeskResponseDTOTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @NotNull @Valid 
  @Schema(name = "time", required = true)
  public CoindeskResponseDTOTime getTime() {
    return time;
  }

  public void setTime(CoindeskResponseDTOTime time) {
    this.time = time;
  }

  public CoindeskResponseDTO disclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
    return this;
  }

  /**
   * Get disclaimer
   * @return disclaimer
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "disclaimer", required = true)
  public String getDisclaimer() {
    return disclaimer;
  }

  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }

  public CoindeskResponseDTO chartName(String chartName) {
    this.chartName = chartName;
    return this;
  }

  /**
   * Get chartName
   * @return chartName
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "chartName", required = true)
  public String getChartName() {
    return chartName;
  }

  public void setChartName(String chartName) {
    this.chartName = chartName;
  }

  public CoindeskResponseDTO bpi(CoindeskResponseDTOBpi bpi) {
    this.bpi = bpi;
    return this;
  }

  /**
   * Get bpi
   * @return bpi
  */
  @NotNull @Valid 
  @Schema(name = "bpi", required = true)
  public CoindeskResponseDTOBpi getBpi() {
    return bpi;
  }

  public void setBpi(CoindeskResponseDTOBpi bpi) {
    this.bpi = bpi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoindeskResponseDTO coindeskResponseDTO = (CoindeskResponseDTO) o;
    return Objects.equals(this.time, coindeskResponseDTO.time) &&
        Objects.equals(this.disclaimer, coindeskResponseDTO.disclaimer) &&
        Objects.equals(this.chartName, coindeskResponseDTO.chartName) &&
        Objects.equals(this.bpi, coindeskResponseDTO.bpi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, disclaimer, chartName, bpi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoindeskResponseDTO {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
    sb.append("    chartName: ").append(toIndentedString(chartName)).append("\n");
    sb.append("    bpi: ").append(toIndentedString(bpi)).append("\n");
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

