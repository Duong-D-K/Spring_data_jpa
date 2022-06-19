package com.example.Springdatajpa;

import com.example.Springdatajpa.model.Student;
import com.example.Springdatajpa.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return  args -> {
			Student maria = new Student(
					"maria",
					"john",
					"kutekahnhbfls@Ggmail.com",
					21);

			studentRepository.save(maria);
		};
	}
}
