package com.land.hexagonalcrud.config;


import com.land.hexagonalcrud.adapter.output.FindAllCustomersAdapter;
import com.land.hexagonalcrud.application.core.usecase.CustomersUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllCustomerConfig {


    @Bean
    public CustomersUseCase customersUseCase(
            FindAllCustomersAdapter findAllCustomersAdapter
    ) {
        return new CustomersUseCase(findAllCustomersAdapter);
    }
}
