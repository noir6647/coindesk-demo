package org.wits.coindesk.model.dto.generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * BpiDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-18T14:32:31.098910400+08:00[Asia/Taipei]")
public class BpiDTO {

    @JsonProperty("code")
    private String code;

    @JsonProperty("nameCht")
    private String nameCht;

    @JsonProperty("rate")
    private String rate;

    @JsonProperty("description")
    private String description;

    @JsonProperty("updatedTimestamp")
    private String updatedTimestamp;

    public BpiDTO code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */

    @Schema(name = "code", required = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BpiDTO nameCht(String nameCht) {
        this.nameCht = nameCht;
        return this;
    }

    /**
     * Get nameCht
     *
     * @return nameCht
     */

    @Schema(name = "nameCht", required = false)
    public String getNameCht() {
        return nameCht;
    }

    public void setNameCht(String nameCht) {
        this.nameCht = nameCht;
    }

    public BpiDTO rate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Get rate
     *
     * @return rate
     */

    @Schema(name = "rate", required = false)
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public BpiDTO description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */

    @Schema(name = "description", required = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BpiDTO updatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    /**
     * Get updatedTimestamp
     *
     * @return updatedTimestamp
     */

    @Schema(name = "updatedTimestamp", required = false)
    public String getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(String updatedTimestamp) {
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
        BpiDTO bpiDTO = (BpiDTO) o;
        return Objects.equals(this.code, bpiDTO.code) &&
            Objects.equals(this.nameCht, bpiDTO.nameCht) &&
            Objects.equals(this.rate, bpiDTO.rate) &&
            Objects.equals(this.description, bpiDTO.description) &&
            Objects.equals(this.updatedTimestamp, bpiDTO.updatedTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, nameCht, rate, description, updatedTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BpiDTO {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    nameCht: ").append(toIndentedString(nameCht)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

