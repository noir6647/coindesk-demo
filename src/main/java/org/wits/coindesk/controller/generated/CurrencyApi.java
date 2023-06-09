/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.wits.coindesk.controller.generated;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import org.wits.coindesk.model.dto.generated.CurrencyCreateRequestDTO;
import org.wits.coindesk.model.dto.generated.CurrencyDTO;
import org.wits.coindesk.model.dto.generated.CurrencyUpdateRequestDTO;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-18T13:39:49.521832300+08:00[Asia/Taipei]")
@Validated
@Tag(name = "Currency", description = "the Currency API")
public interface CurrencyApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /currency/{code} : DELETE CURRENCY
     * delete currency
     *
     * @param code (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteCurrencyCode",
        summary = "DELETE CURRENCY",
        tags = { "CURRENCY" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/currency/{code}"
    )
    default ResponseEntity<Void> deleteCurrencyCode(
        @Parameter(name = "code", description = "", required = true) @PathVariable("code") String code
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /currency/all : GET ALL CURRENCY
     * get all currency
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getCurrencyAll",
        summary = "GET ALL CURRENCY",
        tags = { "CURRENCY" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CurrencyDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/currency/all",
        produces = "application/json"
    )
    default ResponseEntity<List<CurrencyDTO>> getCurrencyAll(

    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : \"code\", \"nameCht\" : \"nameCht\", \"createdTimestamp\" : 6, \"oid\" : 0, \"updatedTimestamp\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /currency/{code} : QUERY CURRENCY
     * query currency
     *
     * @param code (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getCurrencyCode",
        summary = "QUERY CURRENCY",
        tags = { "CURRENCY" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CurrencyDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/currency/{code}",
        produces = "application/json"
    )
    default ResponseEntity<CurrencyDTO> getCurrencyCode(
        @Parameter(name = "code", description = "", required = true) @PathVariable("code") String code
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : \"code\", \"nameCht\" : \"nameCht\", \"createdTimestamp\" : 6, \"oid\" : 0, \"updatedTimestamp\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /currency/{code} : UPDATE CURRENCY
     * update currency
     *
     * @param code                     (required)
     * @param currencyUpdateRequestDTO (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "patchCurrencyCode",
        summary = "UPDATE CURRENCY",
        tags = { "CURRENCY" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CurrencyDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/currency/{code}",
        produces = "application/json",
        consumes = "application/json"
    )
    default ResponseEntity<CurrencyDTO> patchCurrencyCode(
        @Parameter(name = "code", description = "", required = true) @PathVariable("code") String code,
        @Parameter(name = "CurrencyUpdateRequestDTO", description = "") @Valid @RequestBody(required = false)
        CurrencyUpdateRequestDTO currencyUpdateRequestDTO
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : \"code\", \"nameCht\" : \"nameCht\", \"createdTimestamp\" : 6, \"oid\" : 0, \"updatedTimestamp\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /currency : ADD CURRENCY
     * add curreny
     *
     * @param currencyCreateRequestDTO (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "postCurrency",
        summary = "ADD CURRENCY",
        tags = { "CURRENCY" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/currency",
        consumes = "application/json"
    )
    default ResponseEntity<Void> postCurrency(
        @Parameter(name = "CurrencyCreateRequestDTO", description = "") @Valid @RequestBody(required = false)
        CurrencyCreateRequestDTO currencyCreateRequestDTO
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
