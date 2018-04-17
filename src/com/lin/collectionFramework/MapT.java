package com.lin.collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.lin.base.IBase;
import com.lin.collectionFramework.test.Student;

public class MapT implements IBase{


	/**                          						 		����(parent)
	���ӿ�    					Collection                          ||    					  Map   //���ӿ�
	�ӽӿ� 	 List-����(����)  || Queue-����   ||         Set-�� (����)	||
	  		 (�����ҿ����ظ�)   || �����ҿ����ظ� ||  	        �����Ҳ����ظ�	||
																||
	����ʵ����           ArrayList(*)  || LinkedList  || 		 HashSet(*)	||						 HashMap(*)   <Key,Value>-->Entryʵ���� 
		      LinkedList    ||			   ||					||
																||
								��ĵ�������						||						 key��value 	�ɶԴ���
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
		System.out.println("������Ҫ�޸ĵ�id");
		
		Scanner sc=new Scanner(System.in);
		while(true){
			String id=sc.next();
			
			if(students.containsKey(id)){
				System.out.println("�ҵ�ѧ��"+students.get(id));
				System.out.println("�������µ�ѧ������");
				String name_new=sc.next();
				Student ns=new Student(id, name_new);
				students.put(id, ns);
				System.out.println("�޸ĳɹ�!");
				
			}else{
				System.out.println("������!");
				continue;
			}
			break;
			
		}
	}
	/**
	 * ������ȡ
	 */
	public void testEntrySet(){
		Set<Entry<String,Student>> entrySet=students.entrySet();
		for(Entry<String, Student>entry:entrySet){
			System.out.println("id:"+entry.getKey());
			System.out.println("name"+entry.getValue().getName());
		}
		
	}
	
	/**
	 * ɾ��Ԫ�� remove
	 */
	public void delTest(){
		System.out.println("������Ҫɾ����ѧ��id");
		
		Scanner sc=new Scanner(System.in);
		
		while(true){
			String id=sc.next();
			if(students.containsKey(id)){
				students.remove(id);
				System.out.println("ɾ���ɹ�");
			}else{
				System.out.println("��ѧ��������");
//				delTest();
				continue;
				
			}
			sc.close();
			break;
		}
	}
	/**
	 * ����Ԫ�� put()
	 */
	public void addTest(){
		
		Scanner sc=new Scanner(System.in	);

		while(true){
			System.out.println("������ѧ����id");
			
			String id=sc.next();
			if(id.equals("exit")){
				break;
			}
			
			Student s=students.get(id);
			if(s==null){
				System.out.println("������ѧ��������");
				
				String name=sc.next();
				
				students.put(id, new Student(id,name));
				System.out.println("��ӳɹ�!");
			}else{
				System.out.println("ѧ���Ѵ���!");
			}
			
		}
		
		System.out.println("��ѧ��:"+students.size());
		System.out.println(students.toString());
	}
	
}
