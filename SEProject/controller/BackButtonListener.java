package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import views.ScreenSelectionView;
import views.TeacherView;

public class BackButtonListener implements ActionListener {

	private JPanel currentPanel;
	public BackButtonListener(JPanel currentPanel) {
		this.currentPanel = currentPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(currentPanel instanceof TeacherView) {
			new ScreenSelectionView();
		}

	}

}
