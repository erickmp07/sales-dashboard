package com.springboot.salesdashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.salesdashboard.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
