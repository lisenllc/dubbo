package com.alibaba.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	 public static void main(String[] args) throws Exception {       
	     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/spring.xml"});        
	     context.start();         
	     System.in.read(); // 按任意键退出   
	     
	 }

}
