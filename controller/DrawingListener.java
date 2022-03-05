package controller; 

import view.DrawingPanel;
import view.Status;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingListener implements ActionListener {

	private DrawingPanel panel;
	Status status;

	public DrawingListener(DrawingPanel DP, Status s) {
		panel = DP;
		status = s;
	}

	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();

		if (actionCommand.equals("Pen")) {
			status.setShape(actionCommand);
		} else if (actionCommand.equals("Line")) {
			status.setShape(actionCommand);
		} else if (actionCommand.equals("Rectangle")) {
			status.setShape(actionCommand);
		}else if (actionCommand.equals("Circle")) {
			status.setShape(actionCommand);
		}

		if (actionCommand.equals("Black")) {
			status.setColor(actionCommand);
		} else if (actionCommand.equals("Blue")) {
			status.setColor(actionCommand);
		} else if (actionCommand.equals("Green")) {
			status.setColor(actionCommand);
		} else if (actionCommand.equals("Magenta")) {
			status.setColor(actionCommand);
		} else if (actionCommand.equals("Pink")) {
			status.setColor(actionCommand);
		} else if (actionCommand.equals("Orange")) {
			status.setColor(actionCommand);
		} else if (actionCommand.equals("Red")) {
			status.setColor(actionCommand);
		} else if (actionCommand.equals("Yellow")) {
			status.setColor(actionCommand);
		} else if (actionCommand.equals("White")) {
			status.setColor(actionCommand);
		}

		if (actionCommand.equals("Fill Canvas")) {
			status.clear = "Clear";
		}
	}
}
