package com.pattern.structural.adapter;

// producing constant volts 
// Class ---- help you get your targeted object
public class Socket {
	
	public Volt getVolt(){
		return new Volt(120);
	}
}
