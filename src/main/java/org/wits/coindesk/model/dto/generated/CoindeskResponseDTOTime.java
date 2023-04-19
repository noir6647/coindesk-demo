package org.wits.coindesk.model.dto.generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * CoindeskResponseDTOTime
 */

@JsonTypeName("CoindeskResponseDTO_time")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-17T17:16:47.756762500+08:00[Asia/Taipei]")
public class CoindeskResponseDTOTime {

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("updatedISO")
    private String updatedISO;

    @JsonProperty("updateduk")
    private String updateduk;

    public CoindeskResponseDTOTime updated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Get updated
     *
     * @return updated
     */
    @NotNull @Size(min = 1)
    @Schema(name = "updated", required = true)
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public CoindeskResponseDTOTime updatedISO(String updatedISO) {
        this.updatedISO = updatedISO;
        return this;
    }

    /**
     * Get updatedISO
     *
     * @return updatedISO
     */
    @NotNull @Size(min = 1)
    @Schema(name = "updatedISO", required = true)
    public String getUpdatedISO() {
        return updatedISO;
    }

    public void setUpdatedISO(String updatedISO) {
        this.updatedISO = updatedISO;
    }

    public CoindeskResponseDTOTime updateduk(String updateduk) {
        this.updateduk = updateduk;
        return this;
    }

    /**
     * Get updateduk
     *
     * @return updateduk
     */
    @NotNull @Size(min = 1)
    @Schema(name = "updateduk", required = true)
    public String getUpdateduk() {
        return updateduk;
    }

    public void setUpdateduk(String updateduk) {
        this.updateduk = updateduk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoindeskResponseDTOTime coindeskResponseDTOTime = (CoindeskResponseDTOTime) o;
        return Objects.equals(this.updated, coindeskResponseDTOTime.updated) &&
            Objects.equals(this.updatedISO, coindeskResponseDTOTime.updatedISO) &&
            Objects.equals(this.updateduk, coindeskResponseDTOTime.updateduk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updated, updatedISO, updateduk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoindeskResponseDTOTime {\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    updatedISO: ").append(toIndentedString(updatedISO)).append("\n");
        sb.append("    updateduk: ").append(toIndentedString(updateduk)).append("\n");
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

