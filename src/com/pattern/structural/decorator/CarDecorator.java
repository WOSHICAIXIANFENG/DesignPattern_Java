package com.pattern.structural.decorator;

/**
 * Decorator – Decorator class implements the component interface and it has a HAS-A relationship with the component interface
 * @author Samuel
 */
public class CarDecorator implements Car {
	protected Car car;
	
	public CarDecorator(Car c){
		this.car = c;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
	}

}
