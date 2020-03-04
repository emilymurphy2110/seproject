package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import controller.Database;
import model.Teacher;

public class TeacherListItem extends JPanel {
	private JLabel name;
	private JButton open;
	private Teacher teacher;
	
	public TeacherListItem(Teacher teacher) {
		super();
		
		this.teacher = teacher;
		this.name = new JLabel(teacher.getFirstName() + " " + teacher.getLastName() +
				"  -  (" + Database.getNumOfPendingRequestsByTeacher(teacher)+" pending requests)   " );
		this.open = new JButton("View");
		this.open.addActionListener(new ViewTeacherDataButtonListener(teacher));
		this.add(name);
		this.add(open);
	}	
}
