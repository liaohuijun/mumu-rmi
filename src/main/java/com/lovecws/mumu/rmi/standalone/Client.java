package com.lovecws.mumu.rmi.standalone;

import com.lovecws.mumu.rmi.standalone.service.UserService;
import org.apache.log4j.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;

public class Client {
	private static final Logger log=Logger.getLogger(Client.class);
	
	public static void main(String[] args) {
		String url = "rmi://127.0.0.1:8888/userService";
		try {
			Context namingContext = new InitialContext();
			// 检索指定的对象。 即找到服务器端相对应的服务对象存根
			UserService userService = (UserService) namingContext.lookup(url);
			//直接通过Naming获取rmi接口
			//UserService userService2 = (UserService) Naming.lookup(url);
			System.out.println(userService + " 是 " + userService.getClass().getName() + " 的实例！");
			
			userService.add();
			userService.update();
		} catch (Exception e) {
			log.error(e);
		}
	}
}