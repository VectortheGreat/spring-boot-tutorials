package com.kadir.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadir.entities.Student;
import com.kadir.repository.StudentRepository;
import com.kadir.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> optional= studentRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void deleteStudent(Integer id) {
		Student dbStudent = getStudentById(id);
		if (dbStudent!=null) {
			studentRepository.delete(dbStudent);
		}
	}

	@Override
	public Student updateStudent(Integer id, Student updatedStudent) {
		Student dbStudent = getStudentById(id);
		if (dbStudent!=null) {
			dbStudent.setFirstName(updatedStudent.getFirstName());
			dbStudent.setLastName(updatedStudent.getLastName());
			dbStudent.setBirthOfDate(updatedStudent.getBirthOfDate());
			
			return studentRepository.save(dbStudent);
		}
		return null;
	}

}
