package com.land.hexagonalcrud.adapter.output.repository;

import com.land.hexagonalcrud.adapter.output.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
