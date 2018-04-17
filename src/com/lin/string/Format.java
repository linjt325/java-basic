package com.lin.string;

import java.util.Date;


import com.lin.base.IBase;

public class Format implements IBase{

	@Override
	public void run() {
		//System.out.println(String.format("%s, %,.2f", "hehehe",0.4213));
		
		//格式化输出 %2$tB   %参数索引 [$索引结束符]格式化符号
		System.out.printf("%1$s %2$tB %2$te ,%2$tY","Due date:",new Date());
		
//		<表示引用上一个参数
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
