package org.wits.coindesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableOpenApi
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
            //            .securitySchemes(getAppIdKeys())
            // 是否開啟swagger
            .enable(true)
            .select()
            // 過濾條件，掃描指定路徑下的選項
            .apis(RequestHandlerSelectors.basePackage("org.wits.coindesk.controller"))
            // 指定路徑處理，PathSelectors.any()代表不過濾任何路徑
            .paths(PathSelectors.any())
            .build();
    }

}
