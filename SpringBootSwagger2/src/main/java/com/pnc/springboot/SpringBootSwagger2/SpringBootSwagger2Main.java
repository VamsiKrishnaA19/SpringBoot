package com.pnc.springboot.SpringBootSwagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 
/*Swagger2 is an open source project used to generate the REST API documents for RESTful web services. 
 * It provides a user interface to access our RESTful web services via the web browser. */
public class SpringBootSwagger2Main 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SpringBootSwagger2Main.class, args);
    }
    
    /* The configuration of Swagger mainly centers around the Docket bean. 
     * Swagger 2 is enabled through the @EnableSwagger2 annotation. 
     * After the Docket bean is defined, its select() method returns an instance of ApiSelectorBuilder, 
     * which provides a way to control the endpoints exposed by Swagger
     */
    
    @Bean
    public Docket productApi() {
       return new Docket(DocumentationType.SWAGGER_2).select()
    		   .apis(RequestHandlerSelectors.basePackage("com.pnc.springboot.SpringBootSwagger2")).build();
    }
}
