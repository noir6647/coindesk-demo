package org.wits.coindesk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.wits.coindesk.dao.CurrencyDAO;
import org.wits.coindesk.model.dto.entity.CurrencyEntity;
import org.wits.coindesk.model.dto.generated.CurrencyCreateRequestDTO;
import org.wits.coindesk.model.dto.generated.CurrencyUpdateRequestDTO;
import org.wits.coindesk.service.CurrencyService;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CurrencyServiceTest {

    @Spy
    @InjectMocks
    CurrencyService currencyService;
    @Mock
    CurrencyDAO currencyDAO;

    @Test
    void testCreateCurrency(){
        when(currencyDAO.save(any())).thenReturn(new CurrencyEntity());

        CurrencyCreateRequestDTO currencyCreateRequestDTO = new CurrencyCreateRequestDTO();
        currencyCreateRequestDTO.code("code").nameCht("name");
        currencyService.createCurrency(currencyCreateRequestDTO);
        verify(currencyService).createCurrency(currencyCreateRequestDTO);
    }

    @Test
    void testUpdateCurrency() throws Exception {
        CurrencyEntity currencyEntity = new CurrencyEntity();
        when(currencyDAO.save(any())).thenReturn(currencyEntity);
        when(currencyDAO.findByCode(any())).thenReturn(Optional.of(currencyEntity));

        CurrencyUpdateRequestDTO currencyUpdateRequestDTO = new CurrencyUpdateRequestDTO();
        currencyUpdateRequestDTO.nameCht("test");

        assertThat(currencyService.updateCurrency("code", currencyUpdateRequestDTO)).isNotNull();
    }

    @Test
    void testGetCurrency(){
        CurrencyEntity currencyEntity = new CurrencyEntity();
        when(currencyDAO.findByCode(any())).thenReturn(Optional.of(currencyEntity));

        assertThat(currencyService.getCurrency("code")).isNotNull();
    }

    @Test
    void testGetAllCurrency(){
        CurrencyEntity currencyEntity = new CurrencyEntity();
        when(currencyDAO.findAll()).thenReturn(List.of(currencyEntity));

        assertThat(currencyService.getAllCurrency()).isNotNull();
    }

    @Test
    void testDeleteCurrency(){
        currencyService.deleteCurrency("code");
        verify(currencyService).deleteCurrency("code");
    }
}
