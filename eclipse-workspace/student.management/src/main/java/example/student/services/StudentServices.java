package example.student.services;

import java.util.List;

import com.students.entities.Student;

public interface StudentServices {

	String addStudent(example.student.entities.Student st);


	String updateStudent(example.student.entities.Student st);

	String deleteStudent(int univId);

	example.student.entities.Student searchStudent(int univId);

	List<example.student.entities.Student> fetchAllStudents();
}
