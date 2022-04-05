package com.itexperts.projeto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.itexperts.projeto.controller"))
	                .paths(PathSelectors.any())
	                .build()
	                .apiInfo(showMetadata());
	    }


	    private ApiInfo showMetadata() {
	        return new ApiInfoBuilder()
	                .title("REST API ItExperts")
	                .description(" Projeto Final - IT Experts")
	                .version("1.0.0")
	                .license("Apache License Version 2.0")
	                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
	                .contact(new springfox.documentation.service.Contact("Felipe Oliveira", "https://github.com/felipeoliveiraesu", "felipe_oliveira_pdd@yahoo.com.br"))
	                .build();
	    }
}
