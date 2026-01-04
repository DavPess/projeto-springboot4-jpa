package com.estudojava.devjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.devjava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
