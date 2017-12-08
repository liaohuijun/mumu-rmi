package com.lovecws.mumu.rmi.standalone.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 实现remote接口
 * @desc
 * @author ganliang
 * @version 2016年11月25日 下午9:54:27
 */
public interface UserService extends Remote {

	public void add() throws RemoteException;

	public void save() throws RemoteException;

	public void update() throws RemoteException;
}
