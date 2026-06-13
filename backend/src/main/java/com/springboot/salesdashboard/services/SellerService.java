package com.springboot.salesdashboard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.salesdashboard.dto.SellerDTO;
import com.springboot.salesdashboard.repositories.SellerRepository;

@Service
public class SellerService {

    private final SellerRepository repository;

    public SellerService(SellerRepository repository) {
        this.repository = repository;
    }

    public List<SellerDTO> findAll() {
        var result = repository.findAll();

        return result
            .stream()
            .map(x -> new SellerDTO(x))
            .collect(Collectors.toList());
    }
}
