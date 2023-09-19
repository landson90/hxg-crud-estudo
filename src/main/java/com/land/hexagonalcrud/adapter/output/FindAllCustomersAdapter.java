package com.land.hexagonalcrud.adapter.output;

import com.land.hexagonalcrud.adapter.output.mapper.CustomerMapperOutput;
import com.land.hexagonalcrud.adapter.output.repository.CustomerRepository;
import com.land.hexagonalcrud.application.core.domain.CustomerDomain;
import com.land.hexagonalcrud.application.ports.output.CustomersOutputPort;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class FindAllCustomersAdapter implements CustomersOutputPort {


    private final CustomerRepository repository;

    private final CustomerMapperOutput mapperOutput;

    public FindAllCustomersAdapter(CustomerRepository repository, CustomerMapperOutput mapperOutput) {
        this.repository = repository;
        this.mapperOutput = mapperOutput;
    }


    @Override
    public List<CustomerDomain> findAll() {
        var customersEntity = repository.findAll();
        var customersDomain = mapperOutput.toListCostomerEntity(customersEntity);
        return customersDomain;
    }
}
