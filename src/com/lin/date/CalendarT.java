package com.lin.date;

import java.util.Calendar;

import com.lin.base.IBase;

public class CalendarT implements IBase {

	@Override
	public void run() {
		Calendar cal=Calendar.getInstance();
		
		System.out.println(cal.getTime());//��ǰʱ�� 
		System.out.println(cal.getTimeInMillis());//��ǰ������
		int year =cal.get(Calendar.YEAR);
		System.out.println("��:"+year);//���
		
		Date_Sdf ds=new Date_Sdf();
		ds.run(cal.getTime());//����date��ʽ������  ͬʱ���
		
		
	}

}
