package org.wits.coindesk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.wits.coindesk.controller.generated.BpiApi;
import org.wits.coindesk.model.dto.generated.BpiDTO;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BpiController implements BpiApi {

    @Override public ResponseEntity<List<BpiDTO>> getBpi() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
