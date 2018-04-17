package com.lin;

import java.lang.reflect.Method;

import com.lin.collectionFramework.test.Course;


public class HelloWorld {
    public static void main(String[] args) throws Exception{
    	
    	try {
    		//动态加载类  并实例化  获取方法 执行collectionFramework.test
    		String packageName="util";
    		String className="ScannerT";
    		StringBuilder sb=new StringBuilder("com.lin.");
    		sb.append(packageName);
    		sb.append(".");
    		sb.append(className);
    		
			Class<?> c=Class.forName(sb.toString());//加载类
			Object obj=c.newInstance();
			Method run=c.getMethod("run");
			run.invoke(obj);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	
	}
}