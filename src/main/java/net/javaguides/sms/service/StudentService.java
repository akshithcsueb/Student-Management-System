package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentByID(Long id);
	Student updateStudent(Student student);
	void deleteStudentByID(Long id);
}
