package com.pattern.creational.singleton;

// Due to  Java can ensure that any enum value is instantiated only once in a Java program.
// Java Enum values are globally accessible.
// drawback:  enum type is somewhat inflexible; for example, it does not allow lazy initialization.
public enum EnumSingleton {
	INSTANCE;
	
	public static void doSomething(){
		// do something
	}
}
