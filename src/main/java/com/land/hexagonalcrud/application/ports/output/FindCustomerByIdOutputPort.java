package com.land.hexagonalcrud.application.ports.output;

import com.land.hexagonalcrud.application.core.domain.CustomerDomain;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<CustomerDomain> find(Long id);
}
