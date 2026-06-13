package com.springboot.salesdashboard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.salesdashboard.dto.SaleConversionDTO;
import com.springboot.salesdashboard.dto.SaleSumDTO;
import com.springboot.salesdashboard.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.springboot.salesdashboard.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
        + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> totalSalesBySeller();

    @Query("SELECT new com.springboot.salesdashboard.dto.SaleConversionDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
        + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleConversionDTO> salesConversionRate();
}
