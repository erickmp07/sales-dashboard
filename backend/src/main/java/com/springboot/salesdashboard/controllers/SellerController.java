package com.springboot.salesdashboard.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.salesdashboard.dto.SellerDTO;
import com.springboot.salesdashboard.services.SellerService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    private final SellerService service;

    public SellerController(SellerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        var sellers = service.findAll();

        return ResponseEntity.ok(sellers);
    }
}
