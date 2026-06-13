package com.springboot.salesdashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.salesdashboard.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
