package com.pattern.creational.singleton;

// solve multiple thread issue without synchronization
// Inner static helper class
public class BillPughSingleton {
	private BillPughSingleton(){}
	
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance(){
		return SingletonHelper.INSTANCE;
	}
}
