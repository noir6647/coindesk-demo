package org.wits.coindesk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.wits.coindesk.controller.generated.CurrencyApi;
import org.wits.coindesk.model.dto.generated.CurrencyCreateRequestDTO;
import org.wits.coindesk.model.dto.generated.CurrencyDTO;
import org.wits.coindesk.model.dto.generated.CurrencyUpdateRequestDTO;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController implements CurrencyApi {

    @Override public ResponseEntity<Void> deleteCurrencyCode(String code) throws Exception {
        return CurrencyApi.super.deleteCurrencyCode(code);
    }

    @Override public ResponseEntity<List<CurrencyDTO>> getCurrency() throws Exception {
        return CurrencyApi.super.getCurrency();
    }

    @Override
    public ResponseEntity<CurrencyDTO> patchCurrencyCode(String code, CurrencyUpdateRequestDTO currencyUpdateRequestDTO)
        throws Exception {
        return CurrencyApi.super.patchCurrencyCode(code, currencyUpdateRequestDTO);
    }

    @Override public ResponseEntity<Void> postCurrency(CurrencyCreateRequestDTO currencyCreateRequestDTO)
        throws Exception {
        return CurrencyApi.super.postCurrency(currencyCreateRequestDTO);
    }
}
