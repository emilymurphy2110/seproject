package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import views.ScreenSelectionView;
import views.TeacherView;

public class TeacherButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		TeacherView tv = new TeacherView();
	}
}
