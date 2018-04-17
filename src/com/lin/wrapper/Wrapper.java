package com.lin.wrapper;

import com.lin.base.IBase;

public class Wrapper implements IBase {

	@Override
	public void run() {
		
		double a=91.5; //基础类型
		Double b=new Double(a);//手动装箱
		Double c=a;//自动装箱
		System.out.println("b:"+b+";c:"+c);
		
		Double x=new Double(88);
		double d=x.doubleValue();//手动拆箱
		double e=x;//自动拆箱
		int z=x.intValue();
		System.out.println(z);
		System.out.println("d:"+d+";e:"+e);
	}

	
}
