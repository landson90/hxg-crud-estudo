package com.land.hexagonalcrud.application.ports.input;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;

public interface InsertCustomerInputPort {

    CustomerDomain insert(CustomerDomain customerDomain);
}
