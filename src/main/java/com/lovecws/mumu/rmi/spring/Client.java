package com.lovecws.mumu.rmi.spring;

import com.lovecws.mumu.rmi.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 客户端调用
 * @desc
 * @author ganliang
 * @version 2016年11月25日 下午9:39:35
 */
public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-rmi-client.xml");
		context.start();
		UserService userService = (UserService) context.getBean("userServiceClient");

		userService.add();

		context.close();
	}
}
