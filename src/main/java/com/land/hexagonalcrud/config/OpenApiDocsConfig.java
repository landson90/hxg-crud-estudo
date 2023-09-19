package com.land.hexagonalcrud.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.land.hexagonalcrud.config.utils.ConstantsApiDocs.*;


@Configuration
public class OpenApiDocsConfig {


    @Bean
    public OpenAPI clientesHx() {
        return new OpenAPI()
                .info(infoOpenAPI()
                        .contact(contactOpenAPI()))
                .externalDocs(new ExternalDocumentation()
                        .description(API_DOCS_EXTERNAL_DOCS_DESCRIPTION)
                        .url(API_DOCS_EXTERNAL_DOCS_URL));
    }

    private Info infoOpenAPI() {
        return new Info()
                .title(API_DOCS_TITULO)
                .description(API_DOCS_DESCRICAO)
                .version(API_DOCS_VERSAO);
    }

    private Contact contactOpenAPI() {
        return new Contact()
                .name(API_DOCS_CONTACT_NAME)
                .url(API_DOCS_CONTACT_URL_GITHUB)
                .email(API_DOCS_CONTACT_EMAIL);
    }
}
