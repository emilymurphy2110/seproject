package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Teacher;
import views.TeacherDataView;

public class ViewTeacherDataButtonListener implements ActionListener {

	Teacher t;
	
	public ViewTeacherDataButtonListener(Teacher teacher) {
		t = teacher;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new TeacherDataView(t);
	}

}
