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
//常用方法           作用                          	     	  		返回值
//round()  四舍五入		 		 		long
//floor()  返回小于参数的最大整数(向下取整)		double(防止转int溢出)
//ceil()   返回大于参数的最小整数(向上取整)		double
//random() 返回(0,1)的随机数浮点数			double
		double a=12.81;
		
//=======================类型转换  基础数据类型的强转 /包装类的方法等		
		int b=(int)a;
		int c=Double.valueOf(a).intValue();
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		
		long d=Math.round(a);
		System.out.println("四舍五入:"+d);
		
		double e=Math.floor(a);
		System.out.println("向下取整:"+e);
		
		double f=Math.ceil(a);
		System.out.println("向上取整"+f);
		
		System.out.println(Math.random()+":"+Math.PI);
		
		//获取100个不重复的随机数
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
