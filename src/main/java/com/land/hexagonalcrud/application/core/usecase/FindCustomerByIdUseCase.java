package com.land.hexagonalcrud.application.core.usecase;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;
import com.land.hexagonalcrud.application.ports.input.FindCustomerByIdInputPort;
import com.land.hexagonalcrud.application.ports.output.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public CustomerDomain find(Long id) {
        return this.findCustomerByIdOutputPort
                .find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found."));
    }
}
