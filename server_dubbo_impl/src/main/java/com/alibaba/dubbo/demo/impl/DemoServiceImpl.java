package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

}
