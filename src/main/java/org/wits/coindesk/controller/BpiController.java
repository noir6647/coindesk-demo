package org.wits.coindesk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.wits.coindesk.controller.generated.BpiApi;
import org.wits.coindesk.model.dto.generated.BpiDTO;
import org.wits.coindesk.service.BpiService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BpiController implements BpiApi {

    private final BpiService bpiService;

    @Override
    public ResponseEntity<List<BpiDTO>> getBpi() throws Exception {
        return new ResponseEntity<>(bpiService.getBpiInfo(), HttpStatus.OK);
    }
}
