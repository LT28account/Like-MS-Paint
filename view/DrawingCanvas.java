package view; 

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import model.Shapes;
import model.Shape;

public class DrawingCanvas extends JPanel {
	private Shapes panel;
	Status status;

	public DrawingCanvas(Status s) {
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(500, 400));
		panel = new Shapes();
		status = s;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (status.clear.equals("Clear")) {
			panel.reset();
			setBackground(Color.black);
			setBackground(status.selectColor);
			status.clear = "";
		}
		panel.render(g);
	}

	public void draw(int x1, int y1, int x2, int y2) {
		panel.drawShape(new Shape(status.getShape(), status.selectColor, x1, y1, x2, y2));
		repaint();
	}
}
