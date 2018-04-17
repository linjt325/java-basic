package com.lin.collectionFramework.test;

/**
 * @author XxX
 *课程类
 */
public class Course {
	
	private String id;
	
	private String name;
	
	public Course(String id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return  getClass().getName()+" [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj){
		//不需要全部相等 只需要名字相等即表示相等
		if(this==obj){
			return true;
			
		}
		
		if(obj==null){
			return false;
			
		}
		if(!(obj instanceof Course))
			return false;
		
		Course course=(Course) obj;
		if(this.name==null){
			if(course.name==null)
				return true;
			else
				return false;
		}else{
			if(this.name.equals(course.getName()))
				return true;
			else
				return false;
		}
		
	}


	
	 

}
