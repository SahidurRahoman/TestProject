/**
 * 
 */
package com.student.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.app.model.Student;
import com.student.app.repo.StudentRepository;

/**
 * @author intern2
 *
 */
@Service
public class StudentService {
	
	@Autowired StudentRepository studentRepository;
	
	public Student saveStudentData(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudentData(){
		return studentRepository.findAll();
	}
	
	public Student findOne(Long id) {
		return studentRepository.findOne(id);
	}
	
	public Student update(Student student) {
		return saveStudentData(student);
	}

}
