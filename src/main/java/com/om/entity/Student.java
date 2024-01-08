package com.om.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int roll_num;
	private String name;
	private String marks;
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll_num=" + roll_num + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student(int roll_num, String name, String marks) {
		super();
		this.roll_num = roll_num;
		this.name = name;
		this.marks = marks;
	}
	// no args constructor
	public Student() {
		super();
	}
	

}