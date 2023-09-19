package com.land.hexagonalcrud.adapter.input.controller;

import com.land.hexagonalcrud.adapter.input.request.CustomerRequest;
import com.land.hexagonalcrud.adapter.input.response.CustomerResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomerControllerSwagger {

    @PostMapping
    @Operation(summary = "Salvar dados do cliente.")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Retonar os dados do cliente salvo.",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = CustomerResponse.class))})})
    public ResponseEntity<CustomerResponse> save(@RequestBody CustomerRequest request);
}
