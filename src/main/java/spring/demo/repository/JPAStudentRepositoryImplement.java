package spring.demo.repository;

import java.util.ArrayList;
import java.util.List;

import spring.demo.model.Student;

public class JPAStudentRepositoryImplement implements StudentRepository {

	public List<Student> findData() {
		
		List<Student> student = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("E Ma");
		student.add(s1);
		return student;
	}

}
