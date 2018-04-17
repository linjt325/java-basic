package com.lin.collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.lin.base.IBase;
import com.lin.collectionFramework.test.Student;

public class MapT implements IBase{


	/**                          						 		集合(parent)
	根接口    					Collection                          ||    					  Map   //根接口
	子接口 	 List-序列(常用)  || Queue-队列   ||         Set-集 (常用)	||
	  		 (有序且可以重复)   || 有序且可以重复 ||  	        无序且不可重复	||
																||
	常用实现类           ArrayList(*)  || LinkedList  || 		 HashSet(*)	||						 HashMap(*)   <Key,Value>-->Entry实现类 
		      LinkedList    ||			   ||					||
																||
								存的单个对象						||						 key和value 	成对存在
								*/
	
	public Map<String,Student> students;
	
	public MapT() {
		super();
		this.students=new HashMap<String, Student>();
		
	}

	
	@Override
	public void run() {
		
		addTest();
//		delTest();
		//keySet values
		testModify();
		testEntrySet();
		
	}
	
	
	public void testModify(){
		System.out.println("请输入要修改的id");
		
		Scanner sc=new Scanner(System.in);
		while(true){
			String id=sc.next();
			
			if(students.containsKey(id)){
				System.out.println("找到学生"+students.get(id));
				System.out.println("请输入新的学生姓名");
				String name_new=sc.next();
				Student ns=new Student(id, name_new);
				students.put(id, ns);
				System.out.println("修改成功!");
				
			}else{
				System.out.println("不存在!");
				continue;
			}
			break;
			
		}
	}
	/**
	 * 遍历获取
	 */
	public void testEntrySet(){
		Set<Entry<String,Student>> entrySet=students.entrySet();
		for(Entry<String, Student>entry:entrySet){
			System.out.println("id:"+entry.getKey());
			System.out.println("name"+entry.getValue().getName());
		}
		
	}
	
	/**
	 * 删除元素 remove
	 */
	public void delTest(){
		System.out.println("请输入要删除的学生id");
		
		Scanner sc=new Scanner(System.in);
		
		while(true){
			String id=sc.next();
			if(students.containsKey(id)){
				students.remove(id);
				System.out.println("删除成功");
			}else{
				System.out.println("该学生不存在");
//				delTest();
				continue;
				
			}
			sc.close();
			break;
		}
	}
	/**
	 * 新增元素 put()
	 */
	public void addTest(){
		
		Scanner sc=new Scanner(System.in	);

		while(true){
			System.out.println("请输入学生的id");
			
			String id=sc.next();
			if(id.equals("exit")){
				break;
			}
			
			Student s=students.get(id);
			if(s==null){
				System.out.println("请输入学生的名字");
				
				String name=sc.next();
				
				students.put(id, new Student(id,name));
				System.out.println("添加成功!");
			}else{
				System.out.println("学生已存在!");
			}
			
		}
		
		System.out.println("总学生:"+students.size());
		System.out.println(students.toString());
	}
	
}
