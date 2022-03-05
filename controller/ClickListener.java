package controller; 

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.SwingUtilities;

import view.Screen;
import view.DrawingCanvas;
import view.Status;

public class ClickListener implements MouseListener, MouseMotionListener {

	private DrawingCanvas canvas;
	private Status status;
	public boolean bool;
	int x;
	int y;
	Screen screen;

	public ClickListener(DrawingCanvas DC, Status s) {
		canvas = DC;
		status = s;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (!bool) {
			x = e.getX();
			y = e.getY();
			bool = true;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (bool) {
			if (SwingUtilities.isLeftMouseButton(e))
			{
				if (status.getShape().equals("Pen")) {
					canvas.draw(e.getX(), e.getY(), e.getX(), e.getY());
				}
				canvas.draw(x, y, e.getX(), e.getY());
				bool = false;
			}
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (bool) {
			if (SwingUtilities.isLeftMouseButton(e))
			{
				if (status.getShape().equals("Pen")) {
					canvas.draw(e.getX(), e.getY(), e.getX(), e.getY());
				}
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		status.Position(e.getX(), e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}
}
