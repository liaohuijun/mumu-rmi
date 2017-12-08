package com.lovecws.mumu.rmi.standalone;

import com.lovecws.mumu.rmi.standalone.impl.UserServiceImpl;
import org.apache.log4j.Logger;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class Server {
	private static final Logger log = Logger.getLogger(Server.class);

	public static void main(String[] args) {
		try {
			/**
			 * 注册本地接口
			 */
			LocateRegistry.createRegistry(8888);
			
			/**
			 * 绑定一个接口
			 */
			Naming.bind("rmi://localhost:8888/userService", new UserServiceImpl());
			
			/**
			 * 绑定另一个接口
			 */
			Naming.bind("rmi://localhost:8888/userService2", new UserServiceImpl());
			
			System.out.println("服务器注册rmi服务"+UserServiceImpl.class.getName());
		} catch (Exception e) {
			log.error(e);
		}
	}
}