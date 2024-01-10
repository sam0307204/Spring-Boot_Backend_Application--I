package com.backend.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.spring.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
