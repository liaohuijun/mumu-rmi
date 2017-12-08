package com.lovecws.mumu.rmi.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 发布rmi服务
 * @desc
 * @author ganliang
 * @version 2016年11月25日 下午9:39:21
 */
public class Server {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-rmi-server.xml");
		context.start();
		//context.close();
	}
}
