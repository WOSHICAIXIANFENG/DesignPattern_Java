package com.pattern.creational.absfactory;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
