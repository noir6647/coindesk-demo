package org.wits.coindesk.model.dto.generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * CurrencyCreateRequestDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-17T17:16:47.756762500+08:00[Asia/Taipei]")
public class CurrencyCreateRequestDTO {

    @JsonProperty("code")
    private String code;

    @JsonProperty("nameCht")
    private String nameCht;

    public CurrencyCreateRequestDTO code(String code) {
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

    public CurrencyCreateRequestDTO nameCht(String nameCht) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrencyCreateRequestDTO currencyCreateRequestDTO = (CurrencyCreateRequestDTO) o;
        return Objects.equals(this.code, currencyCreateRequestDTO.code) &&
            Objects.equals(this.nameCht, currencyCreateRequestDTO.nameCht);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, nameCht);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrencyCreateRequestDTO {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    nameCht: ").append(toIndentedString(nameCht)).append("\n");
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

