package com.land.hexagonalcrud.adapter.input.controller;


import com.land.hexagonalcrud.adapter.input.request.CustomerRequest;
import com.land.hexagonalcrud.adapter.input.response.CustomerResponse;
import com.land.hexagonalcrud.adapter.output.mapper.CustomerMapperOutput;
import com.land.hexagonalcrud.application.ports.input.InsertCustomerInputPort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class CustomerController implements CustomerControllerSwagger{


    private final InsertCustomerInputPort insertCustomerInputPort;
    private final CustomerMapperOutput mapper;
    @Autowired
    public CustomerController(InsertCustomerInputPort insertCustomerInputPort, CustomerMapperOutput mapper) {
        this.insertCustomerInputPort = insertCustomerInputPort;
        this.mapper = mapper;
    }
    @PostMapping
    public ResponseEntity<CustomerResponse> save(@RequestBody CustomerRequest request) {
        var domain = mapper.toCustomerDomain(request);
        var customerInputPort = insertCustomerInputPort.insert(domain);
        var response = mapper.toCustomerResponse(customerInputPort);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
