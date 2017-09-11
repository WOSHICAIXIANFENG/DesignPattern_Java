package com.pattern.structural.flyweight;

import java.awt.Graphics;
import java.awt.Color;

public interface Shape {
	void draw(Graphics g, int x, int y, int width, int height, Color color);
}
