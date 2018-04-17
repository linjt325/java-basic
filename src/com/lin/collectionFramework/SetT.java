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
		
		Student st=new Student("2", "С��");
		System.out.println(st.getName());

		Scanner sc=new Scanner(System.in);
		
		while(true){
			
			System.out.println("������γ�Id");
			
			String courseId=sc.next();
			if(courseId.equals("exit")){
				break;
			}
			boolean has=false;
			for (Course cr:this.courses){ 
				if(cr.getId().equals(courseId)){
					if(st.getCourses().contains(cr)){
						System.out.println("�ǲ���ɵ�� ,���˻�ѡ!");
					}else{
						st.getCourses().add(cr);
					}
					
					has=true;
					
				}
			}
			if(!has){
				System.out.println("�γ̲�����!");
			}
		}
		print(st.getCourses());
		System.out.println("�˳�");
		sc.close();
	}
	
	
private void testSet(){
		
		Course cr=new Course("1","���ݽṹ");
		this.courses.add(cr);//list ĩβ���Ԫ��

		Course cr2=new Course("2","C");
		
		this.courses.add(cr2);//list���Ԫ��  ָ��λ��
		
		Course[] course={new Course ("3","��ɢ��ѧ"),new Course("4","�ߵ���ѧ")};
		
		this.courses.addAll(Arrays.asList(course)); //�������
		
		Course[] course2={new Course ("5","���"),new Course("6","Ӣ��")};
		
		this.courses.addAll( Arrays.asList(course2));

}


	

	public void print(){
		for(Course cr:courses){//list<>  �涨�˷��� foreach ����ֱ��ȡ�����͹涨������Ԫ�� ����Ҫ����ǿת 
			System.out.println(cr);
		}
	}
	
	public void print(Set<Course>course){
		for(Course cr:course){//list<>  �涨�˷��� foreach ����ֱ��ȡ�����͹涨������Ԫ�� ����Ҫ����ǿת 
			System.out.println(cr);
		}
	}
}
