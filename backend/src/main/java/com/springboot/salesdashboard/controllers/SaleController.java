package com.springboot.salesdashboard.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.salesdashboard.dto.SaleConversionDTO;
import com.springboot.salesdashboard.dto.SaleDTO;
import com.springboot.salesdashboard.dto.SaleSumDTO;
import com.springboot.salesdashboard.services.SaleService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private final SaleService service;

    public SaleController(SaleService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        var sales = service.findAll(pageable);

        return ResponseEntity.ok(sales);
    }

    @GetMapping(value = "total-sales-by-seller")
    public ResponseEntity<List<SaleSumDTO>> totalSalesBySeller() {
        var totalSalesBySeller = service.totalSalesBySeller();

        return ResponseEntity.ok(totalSalesBySeller);
    }

    @GetMapping(value = "sales-conversion-rate")
    public ResponseEntity<List<SaleConversionDTO>> salesConversionRate() {
        var salesConversionRate = service.salesConversionRate();

        return ResponseEntity.ok(salesConversionRate);
    }
}
