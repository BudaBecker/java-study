package com.udemy.Spring_study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.Spring_study.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
