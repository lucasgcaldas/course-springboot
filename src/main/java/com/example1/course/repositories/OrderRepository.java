package com.example1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
