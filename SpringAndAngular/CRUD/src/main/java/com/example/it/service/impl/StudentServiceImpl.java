package com.example.it.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.it.model.Student;
import com.example.it.repo.StudentRepository;
import com.example.it.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;
	
	
	@Override
	public Integer saveStudent(Student s) {
		return repo.save(s).getStdId();
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Student> getOneStudent(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public boolean isExist(Integer id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
