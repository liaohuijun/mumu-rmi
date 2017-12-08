package com.lovecws.mumu.rmi.spring.impl;

import com.lovecws.mumu.rmi.spring.service.UserService;

/**
 * rmi接口实现类
 * @desc
 * @author ganliang
 * @version 2016年11月25日 下午9:30:51
 */
public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("add");
	}

	@Override
	public void delete() {
		System.out.println("delete");
	}

	@Override
	public void query() {
		System.out.println("query");
	}

	@Override
	public void update() {
		System.out.println("update");
	}

}
