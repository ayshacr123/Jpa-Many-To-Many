package com.example.JpaManyToMany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManyToMany.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByNameContaining(String name);

}