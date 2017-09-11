package com.pattern.structural.flyweight;

import java.awt.Graphics;
import java.awt.Color;

import com.pattern.structural.flyweight.Shape;

public class Line implements Shape {
	
	public Line(){
		System.out.println("Creating Line object");
		
		// The object creation is heavy on memory and it an be time consuming too
		//adding time delay
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
		line.setColor(color);
		line.drawLine(x1, y1, x2, y2);
	}

}
