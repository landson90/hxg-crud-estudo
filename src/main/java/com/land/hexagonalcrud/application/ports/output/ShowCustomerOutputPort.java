package com.land.hexagonalcrud.application.ports.output;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;

public interface ShowCustomerOutputPort {

    CustomerDomain show(Long id);
}
