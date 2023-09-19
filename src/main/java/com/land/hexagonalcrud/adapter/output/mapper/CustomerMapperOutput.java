package com.land.hexagonalcrud.adapter.output.mapper;

import com.land.hexagonalcrud.adapter.input.request.CustomerRequest;
import com.land.hexagonalcrud.adapter.input.response.CustomerResponse;
import com.land.hexagonalcrud.adapter.output.entity.CustomerEntity;
import com.land.hexagonalcrud.application.core.domain.CustomerDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper( componentModel = "spring")
public interface CustomerMapperOutput {


    @Mapping(target = "id", ignore = true)
    CustomerDomain toCustomerDomain(CustomerRequest customerRequest);

    CustomerEntity toCustomerEntity(CustomerDomain domain);

    CustomerDomain toCustomer(CustomerEntity customerEntity);

    CustomerResponse toCustomerResponse(CustomerDomain domain);

    List<CustomerDomain> toListCostomerEntity(List<CustomerEntity> customerEntityList);

    List<CustomerResponse> toListCostomerDomain(List<CustomerDomain> customerDomains);
}
