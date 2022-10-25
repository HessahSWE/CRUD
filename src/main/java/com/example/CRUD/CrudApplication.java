package com.example.CRUD;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUD.student.Student;

@SpringBootApplication
@RestController
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		System.out.println("rrrrrrrrrrrrrrrr");
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(new Student( 1L,"Hessah","hessahalhussain@gmail.com",LocalDate.of(2000,Month.FEBRUARY,16),22);
	}

}
