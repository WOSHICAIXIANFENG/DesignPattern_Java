package com.pattern.creational.singleton;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		//ObjectOutput out = new ObjectOutput(new FileOutputStream("filename.ser"));

	}

}
