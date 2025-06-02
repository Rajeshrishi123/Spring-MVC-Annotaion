package com;

public class Student {
	
	private String name;
	private String marks;
	private int id;
	
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(String name, String marks, int id) {
		super();
		this.name = name;
		this.marks = marks;
		this.id = id;
	}
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", id=" + id + "]";
	}
	
	

}
