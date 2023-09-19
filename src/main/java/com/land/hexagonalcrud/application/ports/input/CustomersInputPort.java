package com.land.hexagonalcrud.application.ports.input;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;

import java.util.List;

public interface CustomersInputPort {

    List<CustomerDomain> findAllCustomer();
}
