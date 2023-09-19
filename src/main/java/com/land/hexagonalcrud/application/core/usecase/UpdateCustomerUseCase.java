package com.land.hexagonalcrud.application.core.usecase;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;
import com.land.hexagonalcrud.application.ports.input.UpdateCustomerInputPort;
import com.land.hexagonalcrud.application.ports.output.FindCustomerByIdOutputPort;
import com.land.hexagonalcrud.application.ports.output.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final UpdateCustomerOutputPort updateCustomerOutputPort;
    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public UpdateCustomerUseCase(UpdateCustomerOutputPort updateCustomerOutputPort,
                                 FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.updateCustomerOutputPort = updateCustomerOutputPort;
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }


    @Override
    public void update(CustomerDomain customerDomain, Long id) {
        this.findCustomerByIdOutputPort.find(id);
        this.updateCustomerOutputPort.update(customerDomain, id);
    }
}
