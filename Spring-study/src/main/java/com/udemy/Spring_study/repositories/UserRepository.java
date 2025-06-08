package com.udemy.Spring_study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.Spring_study.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
