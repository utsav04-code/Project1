package com.example.Project2.student;

import jakarta.annotation.ManagedBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student utsav= new Student(
                    "Utsav Roy",
                    "utsavroy44@gmail.com",
                    LocalDate.of(1998, DECEMBER,5));
            Student raman= new Student(
                    "Raman Kumar",
                    "ramankumar02@gmail.com",
                    LocalDate.of(1995, JANUARY,10));

            studentRepository.saveAll(List.of(utsav,raman));
        };


    }
}
