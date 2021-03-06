package com.pattern.creational.singleton;

import java.lang.reflect.Constructor;

// Reflection can be used to destroy all the above singleton implementation approaches.
public class ReflectionSingletonTest {
	 public static void main(String[] args) {
		 EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		 
		 EagerInitializedSingleton instanceTwo = null;
		 try {
			 Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			 for (Constructor constructor : constructors) {
				 // Below code will destroy the singleton pattern
				 constructor.setAccessible(true);
				 instanceTwo = (EagerInitializedSingleton)constructor.newInstance();
			 }
			 
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		 
		 // use hashCode to check instanceOne is the same?
		 System.out.println(instanceOne.hashCode());
		 System.out.println(instanceTwo.hashCode());
	 }
}
