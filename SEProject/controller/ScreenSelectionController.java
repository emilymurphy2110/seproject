package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.RequirementsView;
import views.ScreenSelectionView;
import views.TeacherView;

public class ScreenSelectionController implements ActionListener {
	public model model;
	public ScreenSelectionView screenSelection;
	public TeacherView teacher;
	public RequirementsView requirements;
	
	public ScreenSelectionController(model model) {
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == screenSelection.teacherButton) {
			teacher = new TeacherView();
			screenSelection.selectionScreen.setVisible(false);
		}
		if(e.getSource() == screenSelection.requirementsButton) {
			requirements = new RequirementsView();
			screenSelection.selectionScreen.setVisible(false);
			
		}
	}
	
	
}
