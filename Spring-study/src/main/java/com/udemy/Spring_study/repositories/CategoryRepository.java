package com.udemy.Spring_study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.Spring_study.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
