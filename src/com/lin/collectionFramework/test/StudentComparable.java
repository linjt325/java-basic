package com.lin.collectionFramework.test;

import java.util.HashSet;
import java.util.Set;

public class StudentComparable implements Comparable<StudentComparable>{

	private String id;
	
	private String name;
	

	private Set<Course> courses;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses
				+ "]";
	}
	
	public StudentComparable(String id,String name ) {
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

	@Override
	public int compareTo(StudentComparable o) {
		
		int i= this.id.compareTo(o.id);  //当前比参数大时返回正数; 反之负数,相等为0
//		int i= Integer.parseInt(this.id).compareTo(Integer.parseInt(o.id));  //当前比参数大时返回正数; 反之负数,相等为0
		return i;
	}
	
	
	
}
