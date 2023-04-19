package org.wits.coindesk.model.dto.generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * CoindeskResponseDTOBpiUSD
 */

@JsonTypeName("CoindeskResponseDTO_bpi_USD")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-17T17:16:47.756762500+08:00[Asia/Taipei]")
public class CoindeskResponseDTOBpiUSD {

    @JsonProperty("code")
    private String code;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("rate")
    private String rate;

    @JsonProperty("description")
    private String description;

    @JsonProperty("rate_float")
    private BigDecimal rateFloat;

    public CoindeskResponseDTOBpiUSD code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @NotNull @Size(min = 1)
    @Schema(name = "code", required = true)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CoindeskResponseDTOBpiUSD symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     */
    @NotNull @Size(min = 1)
    @Schema(name = "symbol", required = true)
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public CoindeskResponseDTOBpiUSD rate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Get rate
     *
     * @return rate
     */
    @NotNull @Size(min = 1)
    @Schema(name = "rate", required = true)
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public CoindeskResponseDTOBpiUSD description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @NotNull @Size(min = 1)
    @Schema(name = "description", required = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CoindeskResponseDTOBpiUSD rateFloat(BigDecimal rateFloat) {
        this.rateFloat = rateFloat;
        return this;
    }

    /**
     * Get rateFloat
     *
     * @return rateFloat
     */
    @NotNull @Valid
    @Schema(name = "rate_float", required = true)
    public BigDecimal getRateFloat() {
        return rateFloat;
    }

    public void setRateFloat(BigDecimal rateFloat) {
        this.rateFloat = rateFloat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoindeskResponseDTOBpiUSD coindeskResponseDTOBpiUSD = (CoindeskResponseDTOBpiUSD) o;
        return Objects.equals(this.code, coindeskResponseDTOBpiUSD.code) &&
            Objects.equals(this.symbol, coindeskResponseDTOBpiUSD.symbol) &&
            Objects.equals(this.rate, coindeskResponseDTOBpiUSD.rate) &&
            Objects.equals(this.description, coindeskResponseDTOBpiUSD.description) &&
            Objects.equals(this.rateFloat, coindeskResponseDTOBpiUSD.rateFloat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, symbol, rate, description, rateFloat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoindeskResponseDTOBpiUSD {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rateFloat: ").append(toIndentedString(rateFloat)).append("\n");
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

