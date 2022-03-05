package view; 

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Status extends JPanel {

	private JLabel shape = new JLabel("");
	private JLabel color = new JLabel("");
	private JLabel x = new JLabel("0", JLabel.RIGHT);
	private JLabel y = new JLabel("0", JLabel.RIGHT);
	private String shapeSelect;
	private String colorSelect;
	public String clear = ""; //used in DrawingCanvas.java and DrawingListener.java
	public Color selectColor; //used in DrawingCanvas.java

	public Status() {
		this.setLayout(new GridLayout(1, 4));
		this.add(shape);
		this.add(color);
		this.add(x);
		this.add(y);
	}

	public void setShape(String set) {
		shapeSelect = set;
		shape.setText(shapeSelect);
	}

	public String getShape() {
		return shapeSelect;
	}

	public void setColor(String Select) {
		
		colorSelect = Select;
		color.setText(colorSelect);

		if (colorSelect.equals("Black")) {
			selectColor = Color.black;
		} else if (colorSelect.equals("Blue")) {
			selectColor = Color.blue;
		} else if (colorSelect.equals("Green")) {
			selectColor = Color.green;
		} else if (colorSelect.equals("Magenta")) {
			selectColor = Color.magenta;
		} else if (colorSelect.equals("Pink")) {
			selectColor = Color.pink;
		} else if (colorSelect.equals("Orange")) {
			selectColor = Color.orange;
		} else if (colorSelect.equals("Red")) {
			selectColor = Color.red;
		} else if (colorSelect.equals("Yellow")) {
			selectColor = Color.yellow;
		} else if (colorSelect.equals("White")) {
			selectColor = Color.white;
		}
	}

	public String getColor() {
		return colorSelect;
	}

	public void Position(int X, int Y) {
		x.setText("X: " + X);
		y.setText("Y: " + Y);
	}
}
