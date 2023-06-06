package com.om.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.om.entity.Student;
import com.om.repository.MyRepository;

@Service
public class myService {
	
	@Autowired
	MyRepository repo;
	
	public Student add(Student s)
	{
		return repo.save(s);
	}
	
	public List<Student> allStudent()
	{
		return repo.findAll();
	}
	public String delete(int id)
	{
		 repo.deleteById(id);
		 return "true";
	}
	public Student update(Student s,int id)
	{
		
		 return repo.save(s);
	}
}
