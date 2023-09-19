package com.land.hexagonalcrud.application.core.usecase;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;
import com.land.hexagonalcrud.application.ports.input.CustomersInputPort;
import com.land.hexagonalcrud.application.ports.output.CustomersOutputPort;

import java.util.List;

public class CustomersUseCase implements CustomersInputPort {

    private final CustomersOutputPort outputPort;

    public CustomersUseCase(CustomersOutputPort outputPort) {
        this.outputPort = outputPort;
    }

    @Override
    public List<CustomerDomain> findAllCustomer() {
        var customers = outputPort.findAll();
        return customers;
    }
}
