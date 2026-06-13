package com.springboot.salesdashboard.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.salesdashboard.dto.SaleConversionDTO;
import com.springboot.salesdashboard.dto.SaleDTO;
import com.springboot.salesdashboard.dto.SaleSumDTO;
import com.springboot.salesdashboard.repositories.SaleRepository;

@Service
public class SaleService {

    private final SellerService sellerService;
    private final SaleRepository repository;

    public SaleService(SellerService sellerService, SaleRepository repository) {
        this.sellerService = sellerService;
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerService.findAll();

        var result = repository.findAll(pageable);

        return result
            .map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> totalSalesBySeller() {
        return repository.totalSalesBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleConversionDTO> salesConversionRate() {
        return repository.salesConversionRate();
    }
}
