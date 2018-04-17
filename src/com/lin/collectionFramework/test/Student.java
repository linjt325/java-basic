package com.lin.collectionFramework.test;

import java.util.HashSet;
import java.util.Set;

public class Student{

	private String id;
	
	private String name;
	

	private Set<Course> courses;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses
				+ "]";
	}
	
	public Student(String id,String name ) {
		this.id=id;
		this.name=name;
		this.courses=new HashSet<Course>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	
	
	
}
