package org.wits.coindesk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.wits.coindesk.controller.generated.CoindeskApi;
import org.wits.coindesk.model.dto.generated.CoindeskResponseDTO;
import org.wits.coindesk.service.CoindeskService;

@RestController
@RequiredArgsConstructor
public class CoindeskController implements CoindeskApi {

    private final CoindeskService coindeskService;

    @Override
    public ResponseEntity<CoindeskResponseDTO> getCoindesk() throws Exception {
        return new ResponseEntity<>(coindeskService.getCoindeskInfo(), HttpStatus.OK);
    }
}
