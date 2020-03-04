package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import model.TrainingRequest;
import views.DirectorTeacherView;
import views.DirectorTeacherViewItem;
import views.ScreenSelectionView;
import views.TeacherDataView;
import views.TeacherView;

public class DeclineButtonListener implements ActionListener {

	TrainingRequest req;
	DirectorTeacherViewItem view;

	public DeclineButtonListener(TrainingRequest req, DirectorTeacherViewItem view) {
		super();
		this.req = req;
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		req.answer(Controller.loggedInUser, false);
		
		view.remove(view.accept);
		view.remove(view.decline);
		view.name.setText(view.name.getText() + "    DECLINED   ");
		view.name.setForeground(Color.RED.darker());
	}

}
