package com.lin.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.lin.base.IBase;

/**
 * @author XxX
 *
 */
public class CollectionsT implements IBase {

//����  sort

	//Integer���͵�list �������
	public void testSort(){
		List<Integer> integerList=new ArrayList<Integer>();
		
	Random random=new Random();
	Integer k;
	
		for(int i=0;i<10;i++){
			do{
				k=random.nextInt(100);
			}while(integerList.contains(k));
			
			integerList.add(k);
			
			System.out.println("�ɹ���������:"+k);
			
		
		}
		System.out.println("����ǰ");
		printList(integerList);
		
		System.out.println("�����");
		
		Collections.sort(integerList);
		
		printList(integerList);
	}
	
	
	/**
	 * List �ַ�������
	 */
	public void testSort2(){
		
		List<String> stringList=new ArrayList<String>();
		stringList.add("fuck");
		stringList.add("cao");
		stringList.add("����");
			System.out.println("����ǰ");
			printList(stringList);
			
			System.out.println("�����");
			
			Collections.sort(stringList);
			
			printList(stringList);
		
		
	}
	public <T> void printList(List<T> list){
		for(T ii:list){
			System.out.println(ii);
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		testSort();
		
		testSort2();
	}

}
