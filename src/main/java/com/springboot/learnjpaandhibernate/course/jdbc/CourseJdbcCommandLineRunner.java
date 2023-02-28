package com.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner { //indicates that a bean should run when it is contained within a SpringApplication
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		repository.insert(new Course(1, "Learn AWS Now!","in28minutes"));
		repository.insert(new Course(1, "Learn Azure Now!","in28minutes"));
		repository.insert(new Course(1, "Learn DevOps Now!","in28minutes"));
		
		repository.deleteById(1);
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}
}
