package com.pattern.structural.decorator;

//Component Implementation – The basic implementation of the component interface. 
public class BasicCar implements Car {
	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}
}
