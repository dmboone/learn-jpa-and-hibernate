package com.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner { //indicates that a bean should run when it is contained within a SpringApplication
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		repository.save(new Course(1, "Learn AWS Jpa!","in28minutes"));
		repository.save(new Course(1, "Learn Azure Jpa!","in28minutes"));
		repository.save(new Course(1, "Learn DevOps Jpa!","in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn AWS Jpa!"));
		System.out.println(repository.findByName("Learn DevOps Jpa!"));
	}
}
