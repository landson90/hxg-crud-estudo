package com.land.hexagonalcrud.adapter.output;

import com.land.hexagonalcrud.adapter.output.mapper.CustomerMapperOutput;
import com.land.hexagonalcrud.adapter.output.repository.CustomerRepository;
import com.land.hexagonalcrud.application.core.domain.CustomerDomain;
import com.land.hexagonalcrud.application.ports.output.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    private CustomerRepository customerRepository;
    private CustomerMapperOutput customerMapperOutput;


    @Autowired
    public InsertCustomerAdapter(CustomerRepository customerRepository, CustomerMapperOutput customerMapperOutput) {
        this.customerRepository = customerRepository;
        this.customerMapperOutput = customerMapperOutput;
    }


    @Override
    public CustomerDomain insert(CustomerDomain domain) {
        var customerEntity = customerMapperOutput.toCustomerEntity(domain);
        return customerMapperOutput.toCustomer(customerRepository.save(customerEntity));

    }
}
