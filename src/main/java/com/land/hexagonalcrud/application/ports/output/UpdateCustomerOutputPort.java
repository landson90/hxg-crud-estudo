package com.land.hexagonalcrud.application.ports.output;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;

public interface UpdateCustomerOutputPort {


    void update(CustomerDomain customerDomain, Long id);
}
