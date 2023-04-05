package com.example.JpaManyToMany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManyToMany.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
 //   List<Course> findByPriceLessThan(double price);
}