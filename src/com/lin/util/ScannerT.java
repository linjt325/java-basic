package com.lin.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.Scanner;

import com.lin.base.IBase;

public class ScannerT  implements IBase{

	@SuppressWarnings("resource")
	@Override
	public void run() {
//		Scanner scanner=new Scanner(System.in);
		//通过scanner读取文件
		Scanner scan;
		try {
			//使用不存在的文件构造scanner 会异常
			scan = new Scanner(Paths.get("D:\\Linjt\\学习资料\\全题+答案.txt"));
			System.out.println(scan.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			//使用不能被创建的路径构造PrintWriter 会异常
			//通过printWriter 写文件  
			PrintWriter printer;
			printer = new PrintWriter("D:\\test.txt","UTF-8");
			printer.print("asjsa");
			printer.flush();//需要手动刷新 将数据写入文件
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
