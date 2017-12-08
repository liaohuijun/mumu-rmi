package com.lovecws.mumu.rmi.standalone.impl;

import com.lovecws.mumu.rmi.standalone.service.UserService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserServiceImpl extends UnicastRemoteObject implements UserService {

	private static final long serialVersionUID = 1L;

	public UserServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public void add() throws RemoteException {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("add........................");
	}

	@Override
	public void save() throws RemoteException {
		System.out.println("save........................");
	}

	@Override
	public void update() throws RemoteException {
		System.out.println("update........................");
	}

}
