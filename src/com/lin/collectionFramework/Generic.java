package com.lin.collectionFramework;

import java.util.ArrayList;
import java.util.List;

import com.lin.base.IBase;
import com.lin.collectionFramework.test.Course;
import com.lin.collectionFramework.test.CourseChild;

/**
 * @author XxX
 *	 ����  1.�ڼ��������Ԫ�ز��� (list�涨���͵����ͼ���������),�������ᱨ��;
 *	 	2.�涨�˷��� foreach ����ֱ��ȡ�����͹涨������Ԫ�� ����Ҫ����ǿת 
 *		3.������ӹ涨���͵������͵Ķ���
 *4.���Ͳ���ʹ�û�����������  ����ʹ�û����������͵İ�װ����
 */
public class Generic implements IBase {

	private List<Course> courses;
	
//���Ϸ��Ͳ���ʹ�û�����������  ����������  
//	private List<int> courses1;
	private List<Integer> courses2;
	
	public Generic(){
		this.courses=new ArrayList<Course>();
		
	}
	
	@Override
	public void run() {
//		testGeneric();
		testChild();
		print();
	}
	
	public void testChild(){
		CourseChild cc=new CourseChild("5", "����");
		
		courses.add(cc);
	}
	public void testGeneric(){
		Course cr1=new Course("1","����");
		
		courses.add(cr1);
		
		//���Ԫ�ز���list�涨���͵�����,�������ᱨ��
//		couse.add("123");
		
		Course cr2=new Course("2","��ѧ");
		courses.add(cr2);
		
		
	}
	
	public void print(){
		for(Course cr:courses){//list<>  �涨�˷��� foreach ����ֱ��ȡ�����͹涨������Ԫ�� ����Ҫ����ǿת 
			System.out.println(cr);
		}
	}
	
	

}
