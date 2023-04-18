package org.wits.coindesk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.wits.coindesk.controller.generated.CurrencyApi;
import org.wits.coindesk.model.dto.generated.CurrencyCreateRequestDTO;
import org.wits.coindesk.model.dto.generated.CurrencyDTO;
import org.wits.coindesk.model.dto.generated.CurrencyUpdateRequestDTO;
import org.wits.coindesk.service.CurrencyService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController implements CurrencyApi {

    private final CurrencyService currencyService;

    @Override public ResponseEntity<List<CurrencyDTO>> getCurrencyAll() throws Exception {
        return new ResponseEntity<>(currencyService.getAllCurrency(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteCurrencyCode(String code) {
        currencyService.deleteCurrency(code);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override public ResponseEntity<CurrencyDTO> getCurrencyCode(String code) {
        return new ResponseEntity<>(currencyService.getCurrency(code), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CurrencyDTO> patchCurrencyCode(String code, CurrencyUpdateRequestDTO currencyUpdateRequestDTO)
        throws Exception {
        return new ResponseEntity<>(currencyService.updateCurrency(code, currencyUpdateRequestDTO), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> postCurrency(CurrencyCreateRequestDTO currencyCreateRequestDTO) {
        currencyService.createCurrency(currencyCreateRequestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
