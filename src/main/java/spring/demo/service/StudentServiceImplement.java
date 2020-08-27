package spring.demo.service;

import java.util.List;

import spring.demo.model.Student;
import spring.demo.repository.JPAStudentRepositoryImplement;
import spring.demo.repository.StudentRepository;

public class StudentServiceImplement implements StudentService {

	StudentRepository sr = new JPAStudentRepositoryImplement();
	
	public List<Student> findData() {
		
		return sr.findData();
	}

}
