package one.digitalinnovation.personapi.config;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import io.swagger.models.HttpMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.models.auth.In;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /*@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("one.digitalinnovation.personapi.controller"))
                .paths(PathSelectors.ant("/foos/*"))
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .globalResponses(HttpMethod.GET, ArrayList(
                        new ResponseBuilder().code("500")
                                .description("500 message").build(),
                        new ResponseBuilder().code("403")
                                .description("Forbidden!!!!!").build()
                ));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Simple Spring Boot REST API")
                .description("\"A aplication rest of person\"")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
                .contact(new Contact("Peleias", "https://web.dio.me/lab/desenvolvendo-um-sistema-de-gerenciamento-de-pessoas-em-api-rest-com-spring-boot", "rpeleias@hotmail.com"))
                .build();
    }*/



}
