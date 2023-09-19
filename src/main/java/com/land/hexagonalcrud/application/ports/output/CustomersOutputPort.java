package com.land.hexagonalcrud.application.ports.output;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;

import java.util.List;

public interface CustomersOutputPort {


    List<CustomerDomain> findAll();
}
