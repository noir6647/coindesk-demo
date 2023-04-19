package org.wits.coindesk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.wits.coindesk.dao.CurrencyDAO;
import org.wits.coindesk.manager.CoindeskManager;
import org.wits.coindesk.model.dto.entity.CurrencyEntity;
import org.wits.coindesk.service.BpiService;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BpiServiceTest {

    @InjectMocks
    BpiService bpiService;
    @Mock
    CoindeskManager coindeskManager;
    @Mock
    CurrencyDAO currencyDAO;

    @Test
    void testGetBpiInfo() throws Exception {

        when(coindeskManager.callCoindesk()).thenReturn(
            "{'time':{'updated':'Apr 19, 2023 01:17:00 UTC','updatedISO':'2023-04-19T01:17:00+00:00','updateduk':'Apr 19, 2023 at 02:17 BST'},'disclaimer':'openexchangerates.org','chartName':'Bitcoin','bpi':{'USD':{'code':'USD','symbol':'$','rate':'30,280.7661','description':'United States Dollar','rate_float':30280.7661},'GBP':{'code':'GBP','symbol':'£','rate':'25,302.3659','description':'British Pound Sterling','rate_float':25302.3659}}}");

        CurrencyEntity currencyEntity = new CurrencyEntity();
        currencyEntity.setCode("code");
        currencyEntity.setNameCht("name");
        when(currencyDAO.findByCode(any())).thenReturn(Optional.of(currencyEntity));

        assertThat(bpiService.getBpiInfo()).isNotNull();
    }
}
