package com.lin.collectionFramework.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.lin.base.IBase;

public class CollectionsSortT implements IBase {

	private List<String> list;
	private List<StudentComparable> list_s;
	private List<Student> list_c;
	
	public CollectionsSortT() {
		super();
		this.list = new ArrayList<String>();
		this.list_s=new ArrayList<StudentComparable>();
		this.list_c=new ArrayList<Student>();
	}


	@Override
	public void run() {
//		addStudent();
//		listSort(list_s);//�ַ�����������
		
		addStudentComparator();
		listSortComparator(list_c,StudentComparator.class);
		
		
		
//		addT();
//		listSort(list);//�ַ�����������
	}
	
	public void addStudent(){
		Random ran=new Random();
		List<Integer> intL=new ArrayList<Integer>();
		
		for (int i=0;i<4;i++){
			int xx;
			do{
				xx=ran.nextInt(1000);
			}while(intL.contains(xx));
			
			intL.add(xx);
		}
		
		list_s.add(new StudentComparable(intL.get(0)+"","С��"));
		list_s.add(new StudentComparable(intL.get(1)+"","С��"));
		list_s.add(new StudentComparable(intL.get(2)+"","С��"));
		list_s.add(new StudentComparable(intL.get(3)+"","С��"));
		list_s.add(new StudentComparable(10000+"","С��"));
		
	}
	
	public void addStudentComparator(){
		Random ran=new Random();
		List<Integer> intL=new ArrayList<Integer>();
		
		for (int i=0;i<4;i++){
			int xx;
			do{
				xx=ran.nextInt(1000);
			}while(intL.contains(xx));
			
			intL.add(xx);
		}
		
		list_c.add(new Student(intL.get(0)+"","С��"));
		list_c.add(new Student(intL.get(1)+"","С��"));
		list_c.add(new Student(intL.get(2)+"","С��"));
		list_c.add(new Student(intL.get(3)+"","С��"));
		list_c.add(new Student(10000+"","С��"));
		
	}
	
	public void addT(){
		
		for(int i=0;i<10;i++){
			String base="abcdefghijklmnopqrstuvwxyz0123456789";
			Random random=new Random();
			int x=random.nextInt(10)+1;
			StringBuilder s=new StringBuilder();
			do{
				s.delete(0, s.length());
				for(int z=0;z<x;z++){
					int y=random.nextInt(base.length())+1;
					
					s.append(base.charAt(y));
					
				}
				
			}while(list.contains(s));
			
		list.add(s.toString());
		}
		
	}
	
	public void listSort(List li){
		System.out.println("=======����ǰ==========");
		System.out.println(li.toString());
		Collections.sort(li);
		System.out.println("=======�����==========");
		System.out.println(li.toString());
	}
	
	@SuppressWarnings("unchecked")
	public void listSortComparator(List li,Class clz){
		System.out.println("=======����ǰ==========");
		System.out.println(li.toString());
		Collections.sort(li,new StudentComparator());
		System.out.println("=======�����==========");
		System.out.println(li.toString());
	}

}
