package com.pattern.creational.singleton;

// Lazy Initialized
public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton(){}
	
	// if single thread, OK.  if multiple threads, will have >=2 instance. so it is not thread-safe
	public static LazyInitializedSingleton getInstance(){
		if(instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
