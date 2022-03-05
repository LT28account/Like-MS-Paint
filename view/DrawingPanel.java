package view; 

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;
import java.awt.Container;

import controller.ClickListener;
import controller.DrawingListener;

public class DrawingPanel extends Screen {
	private JFrame window;
	JMenuBar menu;
	JMenu drop1;
	JMenu drop2;
	JMenu drop3;
	JMenuItem[] list1;
	JMenuItem[] list2;
	JMenuItem[] list3;
	DrawingListener listener;
	DrawingCanvas canvas;

	ClickListener click;
	Status status;
	int MenuCount = 0;
	int ItemCount = 0;

	public DrawingPanel(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();

		menu = new JMenuBar();

		list1 = new JMenuItem[10];
		list2 = new JMenuItem[10];
		list3 = new JMenuItem[10];

		this.setJMenuBar(menu);
		drop1 = new JMenu("Choose Shape");
		drop2 = new JMenu("Choose Color");
		drop3 = new JMenu("Fill Canvas");

		list1[0] = new JMenuItem("Pen");
		list1[1] = new JMenuItem("Line");
		list1[2] = new JMenuItem("Rectangle");
		list1[3] = new JMenuItem("Circle");

		list2[0] = new JMenuItem("Black");
		list2[1] = new JMenuItem("Blue");
		list2[2] = new JMenuItem("Green");
		list2[3] = new JMenuItem("Magenta");
		list2[4] = new JMenuItem("Pink");
		list2[5] = new JMenuItem("Orange");
		list2[6] = new JMenuItem("Red");
		list2[7] = new JMenuItem("Yellow");
		list2[8] = new JMenuItem("White");

		list3[0] = new JMenuItem("Fill Canvas");

		menu.add(drop1);
		menu.add(drop2);
		menu.add(drop3);

		status = new Status();
		status.setShape("Pen");
		status.setColor("Black");
		canvas = new DrawingCanvas(status);
		listener = new DrawingListener(this, status);

		click = new ClickListener(canvas, status);
		canvas.addMouseListener(click);
		canvas.addMouseMotionListener(click);

		for (int i = 0; i < 4; i++) {
			drop1.add(list1[i]);
			list1[i].addActionListener(listener);
		}

		for (int i = 0; i < 9; i++) {
			drop2.add(list2[i]);
			list2[i].addActionListener(listener);
		}

		drop3.add(list3[0]);
		list3[0].addActionListener(listener);

		this.getContentPane().add(canvas, BorderLayout.CENTER);
		this.getContentPane().add(status, BorderLayout.SOUTH);
	}
}
