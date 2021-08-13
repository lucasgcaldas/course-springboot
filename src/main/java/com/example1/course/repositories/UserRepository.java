package com.example1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
