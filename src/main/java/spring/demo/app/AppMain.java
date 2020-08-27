package spring.demo.app;

import spring.demo.service.StudentService;
import spring.demo.service.StudentServiceImplement;

public class AppMain {

	public static void main(String[] args) {
		StudentService ss = new StudentServiceImplement();
		System.out.println("Student ID is : " + ss.findData().get(0).getId());
		System.out.println("Student Name is : " + ss.findData().get(0).getName());

	}

}
