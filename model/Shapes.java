package model; 

import java.awt.Graphics;

import java.util.Vector;

public class Shapes {
	Vector draw;

	public Shapes() {
		draw = new Vector();
	}

	public void drawShape(Shape s) {
		draw.add(s);
	}

	public void render(Graphics g) {
		Shape j;
		for (int i = 0; i < draw.size(); i++) {
			j = (Shape) (draw.get(i));
			j.draw(g);
		}
	}

	public void reset() {
		draw.clear();
	}
}
