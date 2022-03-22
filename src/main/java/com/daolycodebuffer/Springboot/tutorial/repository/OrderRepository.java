package com.daolycodebuffer.Springboot.tutorial.repository;

import com.daolycodebuffer.Springboot.tutorial.model.Order;
import com.daolycodebuffer.Springboot.tutorial.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCreationTimeContaining(String creationTime);

}
