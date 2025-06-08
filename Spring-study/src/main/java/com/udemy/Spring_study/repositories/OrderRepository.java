package com.udemy.Spring_study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.Spring_study.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
