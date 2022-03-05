package model; 

import java.awt.Color;
import java.awt.Graphics;

public class Shape {

	String shapeSelect;
	Color colorSelect;
	int x1;
	int y1;
	int x2;
	int y2;
	int x;
	int y;
	int width;
	int height;

	public Shape(String shape, Color color, int x1temp, int y1temp, int x2temp, int y2temp) {
		shapeSelect = shape;
		colorSelect = color;
		x1 = x1temp;
		y1 = y1temp;
		x2 = x2temp;
		y2 = y2temp;

		if (x1 >= x2) {
			x = x2;
			width = x1 - x2;
		} else {
			x = x1;
			width = x2 - x1;
		}

		if (y1 >= y2) {
			y = y2;
			height = y1 - y2;
		} else {
			y = y1;
			height = y2 - y1;
		}
	}

	public void draw(Graphics g) {

		g.setColor(colorSelect);

		if (shapeSelect.equals("Pen")) {
			g.drawLine(x1, y1, x1, y1);
		} else if (shapeSelect.equals("Line")) {
			g.drawLine(x1, y1, x2, y2);
		} else if (shapeSelect.equals("Rectangle")) {
			g.fillRect(x, y, width, height);
		} else if (shapeSelect.equals("Circle")) {
			g.fillOval(x, y, width, height);
		}
	}
}
