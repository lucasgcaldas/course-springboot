package com.example1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
