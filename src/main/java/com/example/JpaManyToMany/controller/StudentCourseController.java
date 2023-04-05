/**
 * 
 */
package com.example.JpaManyToMany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaManyToMany.entity.Course;
import com.example.JpaManyToMany.entity.Student;
import com.example.JpaManyToMany.repo.CourseRepository;
import com.example.JpaManyToMany.repo.StudentRepository;


/**
 * @author Administrator
 *
 */
@Controller
@RestController
@RequestMapping("/student/course")
public class StudentCourseController {
	
	@Autowired
	private StudentRepository studentrepo;
	@Autowired 
	private CourseRepository courserepo;
	
	@PostMapping("/add")
	public Student saveStudentWithCourse(@RequestBody Student student) {
		return studentrepo.save(student);
	}
	
	@GetMapping("/get")
	public List<Student> findAllStudent(){
		return studentrepo.findAll();
	}

//	@GetMapping("/find/{studentid}")
//	public Student findStudent(@PathVariable Long studentid){
//		return studentrepo.findById(studentid).orElse(null);
//	}
//	
//	@GetMapping("/find/{name}")
//	public List<Student> findStudentByName(@PathVariable String name){
//		return studentrepo.findByNameContaining(name);
//	}

	
//	@GetMapping("/search/{price}")
//	public List<Course> findCourseLessThanPrice(@PathVariable double price) {
//	    return courserepo.findByPriceLessThan(price);
//	}
	



}
