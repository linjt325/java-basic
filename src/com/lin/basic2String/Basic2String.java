package com.lin.basic2String;

import com.lin.base.IBase;

public class Basic2String implements IBase {

	@Override
	public void run() {

//		baisc2String
		int c=10;
		String str1=Integer.toString(c);//���ݰ�װ���toString()
		String  str2=String.valueOf(c);//�ַ������valueOf()
		String  str3=c+"";//
		
		
//		String2Basic
		 
		String x="30";
		int a=Integer.valueOf(x);//ת��Ϊ��װ�� ,�Զ�����
		int b=new Integer(x);//�¶���һ����װ�� �Զ�����
		int cc=Integer.parseInt(x); //���ð�װ�ľ�̬���� parseXxx() 
		
		
		
		
		
		
	}

}
