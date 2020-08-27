package spring.demo.repository;

import java.util.List;

import spring.demo.model.Student;

public interface StudentRepository {
	public List<Student> findData();
}
