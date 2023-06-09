/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.wits.coindesk.controller.generated;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import org.wits.coindesk.model.dto.generated.CoindeskResponseDTO;

import javax.annotation.Generated;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-17T17:16:47.756762500+08:00[Asia/Taipei]")
@Validated
@Tag(name = "Coindesk", description = "the Coindesk API")
public interface CoindeskApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /coindesk : CALL COINDESK API
     * call coindesk api
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getCoindesk",
        summary = "CALL COINDESK API",
        tags = { "COINDESK" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CoindeskResponseDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/coindesk",
        produces = "application/json"
    )
    default ResponseEntity<CoindeskResponseDTO> getCoindesk(

    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"chartName\" : \"chartName\", \"bpi\" : { \"EUR\" : { \"symbol\" : \"symbol\", \"rate_float\" : 0.8008281904610115, \"code\" : \"code\", \"rate\" : \"rate\", \"description\" : \"description\" }, \"GBP\" : { \"symbol\" : \"symbol\", \"rate_float\" : 0.8008281904610115, \"code\" : \"code\", \"rate\" : \"rate\", \"description\" : \"description\" }, \"USD\" : { \"symbol\" : \"symbol\", \"rate_float\" : 0.8008281904610115, \"code\" : \"code\", \"rate\" : \"rate\", \"description\" : \"description\" } }, \"time\" : { \"updateduk\" : \"updateduk\", \"updatedISO\" : \"updatedISO\", \"updated\" : \"updated\" }, \"disclaimer\" : \"disclaimer\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
