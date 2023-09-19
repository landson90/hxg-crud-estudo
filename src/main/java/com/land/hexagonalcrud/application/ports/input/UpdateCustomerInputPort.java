package com.land.hexagonalcrud.application.ports.input;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;

public interface UpdateCustomerInputPort {

    void update(CustomerDomain customerDomain, Long id);
}
