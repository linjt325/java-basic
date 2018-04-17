package com.lin.collectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.lin.base.IBase;
import com.lin.collectionFramework.test.Course;
import com.lin.collectionFramework.test.Student;

public class SetT implements IBase {

	
	Set<Course> courses;
	
	public SetT(){
		this.courses=new HashSet<Course>();
	}
	
	
	@Override
	public void run() {
		testSet();
		print();
		
		Student st=new Student("2", "小明");
		System.out.println(st.getName());

		Scanner sc=new Scanner(System.in);
		
		while(true){
			
			System.out.println("请输入课程Id");
			
			String courseId=sc.next();
			if(courseId.equals("exit")){
				break;
			}
			boolean has=false;
			for (Course cr:this.courses){ 
				if(cr.getId().equals(courseId)){
					if(st.getCourses().contains(cr)){
						System.out.println("是不是傻逼 ,有了还选!");
					}else{
						st.getCourses().add(cr);
					}
					
					has=true;
					
				}
			}
			if(!has){
				System.out.println("课程不存在!");
			}
		}
		print(st.getCourses());
		System.out.println("退出");
		sc.close();
	}
	
	
private void testSet(){
		
		Course cr=new Course("1","数据结构");
		this.courses.add(cr);//list 末尾添加元素

		Course cr2=new Course("2","C");
		
		this.courses.add(cr2);//list添加元素  指定位置
		
		Course[] course={new Course ("3","离散数学"),new Course("4","高等数学")};
		
		this.courses.addAll(Arrays.asList(course)); //添加数组
		
		Course[] course2={new Course ("5","汇编"),new Course("6","英语")};
		
		this.courses.addAll( Arrays.asList(course2));

}


	

	public void print(){
		for(Course cr:courses){//list<>  规定了泛型 foreach 可以直接取出泛型规定的类型元素 不需要进行强转 
			System.out.println(cr);
		}
	}
	
	public void print(Set<Course>course){
		for(Course cr:course){//list<>  规定了泛型 foreach 可以直接取出泛型规定的类型元素 不需要进行强转 
			System.out.println(cr);
		}
	}
}
