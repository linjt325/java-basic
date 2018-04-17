package com.lin.string;

import com.lin.base.IBase;

public class StringBuilderT implements IBase{

	public void  run(){
		 StringBuilder str=new StringBuilder();
			// 追加字符串
			str.append("jaewkjldfxmopzd1as3asdasasaaa");
			int len=str.length();
//	        // 从qian往hou每隔三位插入逗号 但是 长度被3整除是最后有一个逗号
//	        for(int i=1;i<=len/3;i++){
//	        	str.insert(4*(i)-1,",") ;  
//	        }
			
			for(int i=3;i<str.length();i=i+4){
				str.insert(i, ",");
			}
			//hou--->qian
//			for(int i=str.length()-3;i>0;i=i-3){
//				str.insert(i,",") ;  
//			}
	        // 将StringBuilder对象转换为String对象并输出
			System.out.print(str.toString());
	}
}
