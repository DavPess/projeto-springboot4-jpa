package com.estudojava.devjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.devjava.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}