package org.wits.coindesk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.wits.coindesk.manager.CoindeskManager;
import org.wits.coindesk.service.CoindeskService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CoindeskServiceTest {

    @InjectMocks
    CoindeskService coindeskService;
    @Mock
    CoindeskManager coindeskManager;

    @Test
    void testGetCoindeskInfo() throws Exception {

        when(coindeskManager.callCoindesk()).thenReturn("{\"time\":{\"updated\":\"Apr 18, 2023 05:50:00 UTC\",\"updatedISO\":\"2023-04-18T05:50:00+00:00\",\"updateduk\":\"Apr 18, 2023 at 06:50 BST\"},\"disclaimer\":\"This data was produced from the CoinDesk Bitcoin Price Index (USD). Non-USD currency data converted using hourly conversion rate from openexchangerates.org\",\"chartName\":\"Bitcoin\",\"bpi\":{\"USD\":{\"code\":\"USD\",\"symbol\":\"&#36;\",\"rate\":\"29,540.4812\",\"description\":\"United States Dollar\",\"rate_float\":29540.4812},\"GBP\":{\"code\":\"GBP\",\"symbol\":\"&pound;\",\"rate\":\"24,683.7898\",\"description\":\"British Pound Sterling\",\"rate_float\":24683.7898},\"EUR\":{\"code\":\"EUR\",\"symbol\":\"&euro;\",\"rate\":\"28,776.7416\",\"description\":\"Euro\",\"rate_float\":28776.7416}}}\n");

        assertThat(coindeskService.getCoindeskInfo()).isNotNull();

    }
}
