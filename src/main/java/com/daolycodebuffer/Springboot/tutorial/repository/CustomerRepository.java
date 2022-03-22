package com.daolycodebuffer.Springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByNameContaining(String name);

}
