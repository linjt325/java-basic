package com.lin.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lin.base.IBase;

public class Date_Sdf implements IBase {

	@Override
	public void run() {
		Date  d=new Date();
		System.out.println("dateʱ��:"+d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//ʱ��ת�ַ���
		String today=sdf.format(d);
		System.out.println("��ǰʱ��:"+today);
		
		//�ַ���תʱ��
		Date date;
		try {
			date = sdf.parse(today);
			System.out.println("ת�����ʱ��:"+date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void run(Date d) {
		System.out.println("dateʱ��:"+d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//ʱ��ת�ַ���
		String today=sdf.format(d);
		System.out.println("��ǰʱ��:"+today);
		
		//�ַ���תʱ��
		Date date;
		try {
			date = sdf.parse(today);
			System.out.println("ת�����ʱ��:"+date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
