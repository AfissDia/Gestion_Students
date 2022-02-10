package com.dia.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dia.student.entity.Student;
import com.dia.student.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementsApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("DIA","Mouhamadou","dia@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Sow","Babacar","sow@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Diop","Sliou","dip@gmail.com");
//		studentRepository.save(student3);
//		Student student4 = new Student ("Ka","Diaynaba","ka@gmail.com");
//		studentRepository.save(student4);
//		
	}
	
	
	
}
