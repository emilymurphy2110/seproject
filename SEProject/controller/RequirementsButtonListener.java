package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import views.DirectorTeacherView;
import views.RequirementsView;
import views.ScreenSelectionView;

public class RequirementsButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		DirectorTeacherView rv = new DirectorTeacherView();
	}
}
