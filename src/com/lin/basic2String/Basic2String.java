package com.lin.basic2String;

import com.lin.base.IBase;

public class Basic2String implements IBase {

	@Override
	public void run() {

//		baisc2String
		int c=10;
		String str1=Integer.toString(c);//数据包装类的toString()
		String  str2=String.valueOf(c);//字符串类的valueOf()
		String  str3=c+"";//
		
		
//		String2Basic
		 
		String x="30";
		int a=Integer.valueOf(x);//转换为包装类 ,自动拆箱
		int b=new Integer(x);//新定义一个包装类 自动拆箱
		int cc=Integer.parseInt(x); //调用包装的静态方法 parseXxx() 
		
		
		
		
		
		
	}

}
