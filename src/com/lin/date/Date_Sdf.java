package com.lin.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lin.base.IBase;

public class Date_Sdf implements IBase {

	@Override
	public void run() {
		Date  d=new Date();
		System.out.println("date时间:"+d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//时间转字符串
		String today=sdf.format(d);
		System.out.println("当前时间:"+today);
		
		//字符串转时间
		Date date;
		try {
			date = sdf.parse(today);
			System.out.println("转换后的时间:"+date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void run(Date d) {
		System.out.println("date时间:"+d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//时间转字符串
		String today=sdf.format(d);
		System.out.println("当前时间:"+today);
		
		//字符串转时间
		Date date;
		try {
			date = sdf.parse(today);
			System.out.println("转换后的时间:"+date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
