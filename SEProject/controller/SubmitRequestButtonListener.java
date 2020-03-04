package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Skill;
import model.Teacher;
import model.TrainingRequest;
import views.TeacherDataView;

public class SubmitRequestButtonListener implements ActionListener {

	private TeacherDataView tdv;
	
	public SubmitRequestButtonListener(TeacherDataView tdv) {
		this.tdv = tdv;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String selected = (String) tdv.list.getSelectedItem();
		Teacher t = tdv.teacher;
		TrainingRequest tr = new TrainingRequest(Controller.loggedInUser,t,Skill.getSkillByString(selected));
		Database.addRequest(tr);
	}

}
