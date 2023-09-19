package com.land.hexagonalcrud.application.core.usecase;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;
import com.land.hexagonalcrud.application.ports.input.InsertCustomerInputPort;
import com.land.hexagonalcrud.application.ports.output.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {


    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(InsertCustomerOutputPort insertCustomerOutputPort) {
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }


    @Override
    public CustomerDomain insert(CustomerDomain customerDomain) {
        CustomerDomain domain = this.insertCustomerOutputPort.insert(customerDomain);
        return domain;
    }
}
