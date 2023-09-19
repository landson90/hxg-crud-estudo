package com.land.hexagonalcrud.application.core.usecase;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;
import com.land.hexagonalcrud.application.ports.input.ShowCustomerInputPort;
import com.land.hexagonalcrud.application.ports.output.FindCustomerByIdOutputPort;
import com.land.hexagonalcrud.application.ports.output.ShowCustomerOutputPort;

public class ShowCustomerUseCase implements ShowCustomerInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;
    private final ShowCustomerOutputPort showCustomerOutputPort;

    public ShowCustomerUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort,
                               ShowCustomerOutputPort showCustomerOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
        this.showCustomerOutputPort = showCustomerOutputPort;
    }

    @Override
    public CustomerDomain show(Long id) {
        this.findCustomerByIdOutputPort.find(id);
        return this.showCustomerOutputPort.show(id);
    }
}
