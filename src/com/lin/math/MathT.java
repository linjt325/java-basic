package com.lin.math;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import com.lin.base.IBase;

public class MathT implements IBase {

	@Override
	public void run() {
		
//		int[] nums=new int[10];
//		int[] numss=new int[]{};
//���÷���           ����                          	     	  		����ֵ
//round()  ��������		 		 		long
//floor()  ����С�ڲ������������(����ȡ��)		double(��ֹתint���)
//ceil()   ���ش��ڲ�������С����(����ȡ��)		double
//random() ����(0,1)�������������			double
		double a=12.81;
		
//=======================����ת��  �����������͵�ǿת /��װ��ķ�����		
		int b=(int)a;
		int c=Double.valueOf(a).intValue();
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		
		long d=Math.round(a);
		System.out.println("��������:"+d);
		
		double e=Math.floor(a);
		System.out.println("����ȡ��:"+e);
		
		double f=Math.ceil(a);
		System.out.println("����ȡ��"+f);
		
		System.out.println(Math.random()+":"+Math.PI);
		
		//��ȡ100�����ظ��������
		Set<Integer> set= new HashSet<Integer>();
		int i;
		for(i=0;set.size()<100;i++){
			int is=(int)(Math.random()*100);
			System.out.println(is);
			set.add(is);
			
		}
		System.out.println(set.size());
		System.out.println(i);
		
		
		
	}

}
