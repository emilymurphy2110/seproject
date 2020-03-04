package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import model.Teacher;

public class TeacherListItem extends JPanel {
	private JLabel name;
	private JButton open;
	private Teacher teacher;
	
	public TeacherListItem(Teacher teacher) {
		super();
		
		this.teacher = teacher;
		this.name = new JLabel(teacher.getLastName());
		this.open = new JButton("View");
		this.add(name);
		this.add(open);
	}	
}
