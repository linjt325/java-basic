package com.lin.date;

import java.util.Calendar;

import com.lin.base.IBase;

public class CalendarT implements IBase {

	@Override
	public void run() {
		Calendar cal=Calendar.getInstance();
		
		System.out.println(cal.getTime());//当前时间 
		System.out.println(cal.getTimeInMillis());//当前毫秒数
		int year =cal.get(Calendar.YEAR);
		System.out.println("年:"+year);//年份
		
		Date_Sdf ds=new Date_Sdf();
		ds.run(cal.getTime());//调用date格式化方法  同时输出
		
		
	}

}
