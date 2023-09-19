package com.land.hexagonalcrud.config;


import com.land.hexagonalcrud.adapter.output.InsertCustomerAdapter;
import com.land.hexagonalcrud.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(InsertCustomerAdapter insertCustomerAdapter) {
        return new InsertCustomerUseCase(insertCustomerAdapter);
    }
}
