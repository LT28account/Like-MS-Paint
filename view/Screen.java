package view; 

import javax.swing.JFrame;

public class Screen extends JFrame {
	public Screen() {
		this.setLocation(500, 300);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Screen(int xSize, int ySize, int xLocat, int yLocat, boolean visible, String title) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(visible);
		this.setTitle(title);
		this.setLocation(xLocat, yLocat);
		this.setSize(xSize, ySize);
	}

	public void Title(String title) {
		this.setTitle(title);
	}

	public void Location(int x, int y) {
		this.setLocation(x, y);
	}

	public void Size(int x, int y) {
		this.setSize(x, y);
	}

	public void Show() {
		this.setVisible(true);
	}

	public void Hide() {
		this.setVisible(false);
	}
}
