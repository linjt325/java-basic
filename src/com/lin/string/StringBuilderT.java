package com.lin.string;

import com.lin.base.IBase;

public class StringBuilderT implements IBase{

	public void  run(){
		 StringBuilder str=new StringBuilder();
			// ׷���ַ���
			str.append("jaewkjldfxmopzd1as3asdasasaaa");
			int len=str.length();
//	        // ��qian��houÿ����λ���붺�� ���� ���ȱ�3�����������һ������
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
	        // ��StringBuilder����ת��ΪString�������
			System.out.print(str.toString());
	}
}
