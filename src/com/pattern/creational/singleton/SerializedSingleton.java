package com.pattern.creational.singleton;

import java.io.Serializable;

// in distributed systems, sometimes, we need to Serializable one singleton class to store it's state in file system 
// and retrieve it at later point of time

// Problem: it will create a new instance of the class whenever we deserialize it
public class SerializedSingleton implements Serializable {
	private static final long serialVersionUID = -8866255264406661142L;
	
	private SerializedSingleton(){}
	
	private static class SingletonHelper{
		private static final SerializedSingleton instance = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
	
	protected Object readResolve() {
	    return getInstance();
	}
}
