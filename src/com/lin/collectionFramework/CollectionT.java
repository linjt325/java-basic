package com.lin.collectionFramework;


import com.lin.base.IBase;

public class CollectionT implements IBase {

	
	//数组:集合区别
//	数组的长度固定,当长度不够时需要新建数组 将旧数组复制过去  ,  数组只能通过下标访问元素  下标为int , 应用的时候不知道在哪个位置需要便利
//  集合提供了映射关系 可以通过任意类型的 key去获取对应对象
	
/**                          						 		集合(pppppparent)
*根接口    					Collection                          ||    					  Map   //根接口
*子接口 	 List-序列(常用)  || Queue-队列   ||         Set-集 (常用)	||
*  		 (有序且可以重复)   || 有序且可以重复 ||  	        无序且不可重复	||
*															||
*常用实现类           ArrayList(*)  || LinkedList  || 		 HashSet(*)	||						 HashMap(*)   <Key,Value>-->Entry实现类 
*	      LinkedList    ||			   ||					||
*															||
*							存的单个对象						||						 key和value 	成对存在
*	
*	Collection 是List Set Queue 接口的父接口
*	定义了可用于操作List Set Queue的方法-增删改查  
*	
	*/
	
	/**															定义默认的比较方法             定义临时比较方法
	 *  Collections  工具类  sort  Collections.sort(List<T>) T 需要实现comparable接口 或者comparator 接口
	 *  													     compareTo(T o)    compare(T o1,T o2)      
	 */
	
	
	@Override
	public void run() {

	}

}
