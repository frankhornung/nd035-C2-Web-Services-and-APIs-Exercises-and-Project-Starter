package com.udacity.vehicles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

// mostly the same as in the lectures
@Configuration
@EnableSwagger2
public class SwaggerConf {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfo(
                "The Vehicles API",
                "this api returns information about cars",
                "1.0",
                "http://www.udacity.com/tos",
                new Contact("Franky", "www.udacity.com", "doesnotexist@doesnotexist.com"),
                "no license",
                "no license url",
                Collections.emptyList()
                );
    }

}
