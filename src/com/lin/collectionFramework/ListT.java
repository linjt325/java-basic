package com.lin.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.lin.base.IBase;
import com.lin.collectionFramework.test.Course;

public class ListT implements IBase {

	/**
	 * List接口及其实现类ArrayList
	 * List是元素有序并且可以重复的集合,被称为序列;
	 * List可以精确的控制每个元素的插入位置,或删除某个位置的元素 
	 * 
	 * 底层由数组实现
	 */
	private List<Course> coursesToSelect;
	private Scanner console;
	

	public ListT(){
		this.coursesToSelect=new ArrayList<Course>();
		console=new Scanner(System.in);
		
}
	
	@Override
	public void run() {
	
		//add方法添加元素  addAll 添加数组形式的元素
		testSet();
		
		System.out.println("=========");
		//foreach遍历
//		testGet();
		//set方法 修改指定位置的元素
		testModify();
		
		//迭代器遍历
//		testIterator();
		//删除list中的元素
//		testRemove();
		
//		testAddOdd();
//		
		testIterator();
	}
	
	public void testAddOdd(){
//		coursesToSelect.add("123");
	}
	
	/**
	 * list删除
	 */
	public void testRemove(){
		
		//删除单一元素
//		Course cr= (Course) coursesToSelect.get(4);  
//		System.out.println("即将删除:"+cr);
//		coursesToSelect.remove(cr); //传入对象删除
//		coursesToSelect.remove(4);//传入索引删除
		
		
		Course[] crs={(Course) coursesToSelect.get(4),(Course) coursesToSelect.get(5)};
		System.out.println("即将删除 :"+crs[0]+crs[1]);
		coursesToSelect.removeAll(Arrays.asList(crs));
		testGet();
		
	}

	
	
	/**
	 * list修改
	 */
	public void testModify(){
		coursesToSelect.set(4, new Course("7","老毛"));
		
		
	}
	
	/**
	 * 通过迭代器获取 list元素
	 */
	private void testIterator(){
		Iterator it=coursesToSelect.iterator();
		System.out.println("有如下课程待选");
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
		
	}
	private void testGet(){
		
		for(Object cc:coursesToSelect){
			Course cr=(Course) cc;
			System.out.println(cr);
		}
	}
	
	private void testSet(){
		
		Course cr=new Course("1","数据结构");
		this.coursesToSelect.add(cr);//list 末尾添加元素
		Course cr1=(Course) this.coursesToSelect.get(0);
		System.out.println(cr1);

		Course cr2=new Course("2","C");
		
		this.coursesToSelect.add(1, cr2);//list添加元素  指定位置
		Course cr3=(Course) this.coursesToSelect.get(1);
		System.out.println(cr3);
		
		//会抛出数组下标越界异常   此时list.size()=2 
//		this.getCoursesToSelect().add(3, cr2);
		
		
		Course[] course={new Course ("3","离散数学"),new Course("4","高等数学")};
		
		this.coursesToSelect.addAll(Arrays.asList(course)); //添加数组
		
		System.out.println((Course)(this.coursesToSelect.get(2)));
		System.out.println(this.coursesToSelect.get(3));
		
		
		Course[] course2={new Course ("5","汇编"),new Course("6","英语")};
		
		coursesToSelect.addAll(2, Arrays.asList(course2));
		
		System.out.println((Course)(this.coursesToSelect.get(2)));
		System.out.println(this.coursesToSelect.get(3));
		
		
	}
	
	
	public List getCoursesToSelect() {
		return coursesToSelect;
	}

	public void setCoursesToSelect(List coursesToSelect) {
		this.coursesToSelect = coursesToSelect;
	}

}
