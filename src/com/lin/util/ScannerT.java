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
		//ͨ��scanner��ȡ�ļ�
		Scanner scan;
		try {
			//ʹ�ò����ڵ��ļ�����scanner ���쳣
			scan = new Scanner(Paths.get("D:\\Linjt\\ѧϰ����\\ȫ��+��.txt"));
			System.out.println(scan.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			//ʹ�ò��ܱ�������·������PrintWriter ���쳣
			//ͨ��printWriter д�ļ�  
			PrintWriter printer;
			printer = new PrintWriter("D:\\test.txt","UTF-8");
			printer.print("asjsa");
			printer.flush();//��Ҫ�ֶ�ˢ�� ������д���ļ�
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
