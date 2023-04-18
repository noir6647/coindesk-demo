package org.wits.coindesk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.wits.coindesk.controller.generated.CoindeskApi;
import org.wits.coindesk.model.dto.generated.CoindeskResponseDTO;

@RestController
@RequiredArgsConstructor
public class CoindeskController implements CoindeskApi {
    @Override public ResponseEntity<CoindeskResponseDTO> getCoindesk() throws Exception {
        return CoindeskApi.super.getCoindesk();
    }
}
