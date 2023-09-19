package com.land.hexagonalcrud.application.core.usecase;

import com.land.hexagonalcrud.application.ports.input.DeleteCustomerInputPort;
import com.land.hexagonalcrud.application.ports.output.DeleteCustomerOutputPort;
import com.land.hexagonalcrud.application.ports.output.FindCustomerByIdOutputPort;

public class DeleteCustomerUseCase implements DeleteCustomerInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;
    private final DeleteCustomerOutputPort deleteCustomerOutputPort;

    public DeleteCustomerUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort,
                                 DeleteCustomerOutputPort deleteCustomerOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
        this.deleteCustomerOutputPort = deleteCustomerOutputPort;
    }

    @Override
    public void delete(Long id) {
        this.findCustomerByIdOutputPort.find(id);
        this.deleteCustomerOutputPort.delete(id);
    }
}
