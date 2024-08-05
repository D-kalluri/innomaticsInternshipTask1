package example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.student.entities.Student;



public interface StudentRepository 
				extends JpaRepository<Student, Integer>{

}

