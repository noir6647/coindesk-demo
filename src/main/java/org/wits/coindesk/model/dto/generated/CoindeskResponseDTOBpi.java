package org.wits.coindesk.model.dto.generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * CoindeskResponseDTOBpi
 */

@JsonTypeName("CoindeskResponseDTO_bpi")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-17T17:16:47.756762500+08:00[Asia/Taipei]")
public class CoindeskResponseDTOBpi {

    @JsonProperty("USD")
    private CoindeskResponseDTOBpiUSD USD;

    @JsonProperty("GBP")
    private CoindeskResponseDTOBpiUSD GBP;

    @JsonProperty("EUR")
    private CoindeskResponseDTOBpiUSD EUR;

    public CoindeskResponseDTOBpi USD(CoindeskResponseDTOBpiUSD USD) {
        this.USD = USD;
        return this;
    }

    /**
     * Get USD
     *
     * @return USD
     */
    @NotNull @Valid
    @Schema(name = "USD", required = true)
    public CoindeskResponseDTOBpiUSD getUSD() {
        return USD;
    }

    public void setUSD(CoindeskResponseDTOBpiUSD USD) {
        this.USD = USD;
    }

    public CoindeskResponseDTOBpi GBP(CoindeskResponseDTOBpiUSD GBP) {
        this.GBP = GBP;
        return this;
    }

    /**
     * Get GBP
     *
     * @return GBP
     */
    @NotNull @Valid
    @Schema(name = "GBP", required = true)
    public CoindeskResponseDTOBpiUSD getGBP() {
        return GBP;
    }

    public void setGBP(CoindeskResponseDTOBpiUSD GBP) {
        this.GBP = GBP;
    }

    public CoindeskResponseDTOBpi EUR(CoindeskResponseDTOBpiUSD EUR) {
        this.EUR = EUR;
        return this;
    }

    /**
     * Get EUR
     *
     * @return EUR
     */
    @NotNull @Valid
    @Schema(name = "EUR", required = true)
    public CoindeskResponseDTOBpiUSD getEUR() {
        return EUR;
    }

    public void setEUR(CoindeskResponseDTOBpiUSD EUR) {
        this.EUR = EUR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoindeskResponseDTOBpi coindeskResponseDTOBpi = (CoindeskResponseDTOBpi) o;
        return Objects.equals(this.USD, coindeskResponseDTOBpi.USD) &&
            Objects.equals(this.GBP, coindeskResponseDTOBpi.GBP) &&
            Objects.equals(this.EUR, coindeskResponseDTOBpi.EUR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(USD, GBP, EUR);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoindeskResponseDTOBpi {\n");
        sb.append("    USD: ").append(toIndentedString(USD)).append("\n");
        sb.append("    GBP: ").append(toIndentedString(GBP)).append("\n");
        sb.append("    EUR: ").append(toIndentedString(EUR)).append("\n");
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

