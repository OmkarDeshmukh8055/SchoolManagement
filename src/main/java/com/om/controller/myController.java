package com.om.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.om.entity.Student;
import com.om.services.myService;

@RestController
public class myController {

	@Autowired
	myService ser;

	@PostMapping("addStudent")          
	public Student add(@RequestBody Student s) {
		return ser.add(s);
	}

	@GetMapping("allStudent")
	public List<Student> list() {
		return ser.allStudent();
	}

	@DeleteMapping("deleteData{id}")
	public String deleteinfo(@PathVariable int id) {

		return ser.delete(id);
	}

	@PutMapping("updateData{id}")
	public Student updateinfo(@RequestBody Student s, @PathVariable int id) {

		return ser.update(s, id);
	}
}

