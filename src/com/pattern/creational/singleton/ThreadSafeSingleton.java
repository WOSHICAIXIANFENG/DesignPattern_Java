package com.pattern.creational.singleton;

// Lazy Initialized with thread safe
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton(){}
	
	// drawback: it reduces the performance because of when the instance was created, 
	// you don't need to do extra check for next every time.
	public static synchronized ThreadSafeSingleton getInstance(){
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	
	// to solve the above problem
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
		// double checked locking
		if(instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				} 
			}
		}
		return instance;
	}
}
