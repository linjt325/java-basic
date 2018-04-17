package com.lin.collectionFramework;

import java.util.ArrayList;
import java.util.List;

import com.lin.base.IBase;
import com.lin.collectionFramework.test.Course;
import com.lin.collectionFramework.test.CourseChild;

/**
 * @author XxX
 *	 泛型  1.在集合中添加元素不是 (list规定泛型的类型及其子类型),编译器会报错;
 *	 	2.规定了泛型 foreach 可以直接取出泛型规定的类型元素 不需要进行强转 
 *		3.可以添加规定类型的子类型的对象
 *4.泛型不能使用基础数据类型  必须使用基本数据类型的包装类型
 */
public class Generic implements IBase {

	private List<Course> courses;
	
//集合泛型不能使用基本数据类型  编译器报错  
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
		CourseChild cc=new CourseChild("5", "生物");
		
		courses.add(cc);
	}
	public void testGeneric(){
		Course cr1=new Course("1","语文");
		
		courses.add(cr1);
		
		//添加元素不是list规定泛型的类型,编译器会报错
//		couse.add("123");
		
		Course cr2=new Course("2","数学");
		courses.add(cr2);
		
		
	}
	
	public void print(){
		for(Course cr:courses){//list<>  规定了泛型 foreach 可以直接取出泛型规定的类型元素 不需要进行强转 
			System.out.println(cr);
		}
	}
	
	

}
