package com.lin.wrapper;

import com.lin.base.IBase;

public class Wrapper implements IBase {

	@Override
	public void run() {
		
		double a=91.5; //��������
		Double b=new Double(a);//�ֶ�װ��
		Double c=a;//�Զ�װ��
		System.out.println("b:"+b+";c:"+c);
		
		Double x=new Double(88);
		double d=x.doubleValue();//�ֶ�����
		double e=x;//�Զ�����
		int z=x.intValue();
		System.out.println(z);
		System.out.println("d:"+d+";e:"+e);
	}

	
}
