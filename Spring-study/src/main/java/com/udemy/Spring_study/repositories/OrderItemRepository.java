package com.udemy.Spring_study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.Spring_study.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
