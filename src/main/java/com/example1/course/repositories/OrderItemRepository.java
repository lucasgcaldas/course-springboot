package com.example1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
