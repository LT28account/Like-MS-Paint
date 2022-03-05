import view.DrawingPanel;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		var screen = new DrawingPanel(window);
		screen.init();
		
		screen.Size(400, 400);
		screen.Show();
	}
}
