package com.example.Project2;

import com.example.Project2.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class Project2Application {


	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}



}
