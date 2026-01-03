package com.estudojava.devjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.devjava.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
