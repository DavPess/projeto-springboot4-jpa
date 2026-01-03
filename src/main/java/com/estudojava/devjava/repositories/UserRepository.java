package com.estudojava.devjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.devjava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
