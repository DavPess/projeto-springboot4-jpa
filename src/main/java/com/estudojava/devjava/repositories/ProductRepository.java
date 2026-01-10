package com.estudojava.devjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.devjava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
