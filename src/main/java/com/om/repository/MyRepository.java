package com.om.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.om.entity.Student;

public interface MyRepository extends JpaRepository<Student, Integer>{

}
