package com.lin.string;

import java.util.Date;


import com.lin.base.IBase;

public class Format implements IBase{

	@Override
	public void run() {
		//System.out.println(String.format("%s, %,.2f", "hehehe",0.4213));
		
		//��ʽ����� %2$tB   %�������� [$����������]��ʽ������
		System.out.printf("%1$s %2$tB %2$te ,%2$tY","Due date:",new Date());
		
//		<��ʾ������һ������
		System.out.printf("%s %tB %<te ,%<tY","Due date:",new Date());
		
//	int[] x=new int[10];
//	
//	int count =0;
//	
//	for (;count<10;)
//		x[count++]=count;
//		System.out.println(x.toString());
 	}

}
