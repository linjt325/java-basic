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
	 * List�ӿڼ���ʵ����ArrayList
	 * List��Ԫ�������ҿ����ظ��ļ���,����Ϊ����;
	 * List���Ծ�ȷ�Ŀ���ÿ��Ԫ�صĲ���λ��,��ɾ��ĳ��λ�õ�Ԫ�� 
	 * 
	 * �ײ�������ʵ��
	 */
	private List<Course> coursesToSelect;
	private Scanner console;
	

	public ListT(){
		this.coursesToSelect=new ArrayList<Course>();
		console=new Scanner(System.in);
		
}
	
	@Override
	public void run() {
	
		//add�������Ԫ��  addAll ���������ʽ��Ԫ��
		testSet();
		
		System.out.println("=========");
		//foreach����
//		testGet();
		//set���� �޸�ָ��λ�õ�Ԫ��
		testModify();
		
		//����������
//		testIterator();
		//ɾ��list�е�Ԫ��
//		testRemove();
		
//		testAddOdd();
//		
		testIterator();
	}
	
	public void testAddOdd(){
//		coursesToSelect.add("123");
	}
	
	/**
	 * listɾ��
	 */
	public void testRemove(){
		
		//ɾ����һԪ��
//		Course cr= (Course) coursesToSelect.get(4);  
//		System.out.println("����ɾ��:"+cr);
//		coursesToSelect.remove(cr); //�������ɾ��
//		coursesToSelect.remove(4);//��������ɾ��
		
		
		Course[] crs={(Course) coursesToSelect.get(4),(Course) coursesToSelect.get(5)};
		System.out.println("����ɾ�� :"+crs[0]+crs[1]);
		coursesToSelect.removeAll(Arrays.asList(crs));
		testGet();
		
	}

	
	
	/**
	 * list�޸�
	 */
	public void testModify(){
		coursesToSelect.set(4, new Course("7","��ë"));
		
		
	}
	
	/**
	 * ͨ����������ȡ listԪ��
	 */
	private void testIterator(){
		Iterator it=coursesToSelect.iterator();
		System.out.println("�����¿γ̴�ѡ");
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
		
		Course cr=new Course("1","���ݽṹ");
		this.coursesToSelect.add(cr);//list ĩβ���Ԫ��
		Course cr1=(Course) this.coursesToSelect.get(0);
		System.out.println(cr1);

		Course cr2=new Course("2","C");
		
		this.coursesToSelect.add(1, cr2);//list���Ԫ��  ָ��λ��
		Course cr3=(Course) this.coursesToSelect.get(1);
		System.out.println(cr3);
		
		//���׳������±�Խ���쳣   ��ʱlist.size()=2 
//		this.getCoursesToSelect().add(3, cr2);
		
		
		Course[] course={new Course ("3","��ɢ��ѧ"),new Course("4","�ߵ���ѧ")};
		
		this.coursesToSelect.addAll(Arrays.asList(course)); //�������
		
		System.out.println((Course)(this.coursesToSelect.get(2)));
		System.out.println(this.coursesToSelect.get(3));
		
		
		Course[] course2={new Course ("5","���"),new Course("6","Ӣ��")};
		
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
