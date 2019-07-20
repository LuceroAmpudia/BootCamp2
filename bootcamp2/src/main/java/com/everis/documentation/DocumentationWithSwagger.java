package com.everis.documentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class DocumentationWithSwagger {

	  @Bean
	   public Docket projectBootcampApi() {
	       return new Docket(DocumentationType.SWAGGER_2)
	               .select()
	               .apis(RequestHandlerSelectors.basePackage("com.everis"))
	               .paths(PathSelectors.any())
	               .build();
	   }
}
