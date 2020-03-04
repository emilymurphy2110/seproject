package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.BackButtonListener;
import controller.Controller;
import controller.SubmitRequestButtonListener;
import model.Teacher;

public class TeacherDataView extends JPanel {

	private final String[] skills = { "ART","BIOLOGY","CHEMISTRY",
			"COOKING","ENGLISH","FRENCH","GAELIC","GEOGRAPHY",
			"GERMAN","HISTORY","IT","ITALIAN","MATHS","MUSIC", "PE",
			"PHOTOGRAPHY","PHYSICS","PSYCHOLOGY","SOCIOLOGY","SPANISH"};
	
	private GridBagLayout layout = new GridBagLayout();
	private JLabel label1 = new JLabel("Teacher Name");
	private JLabel label2 = new JLabel("Courses");
	private JLabel label3 = new JLabel("Skills");
	private JLabel label4 = new JLabel("New Training Request");
	public JComboBox list = new JComboBox(skills);
	private JButton button1 = new JButton("Submit");
	private JButton button2 = new JButton("Back");
	public Teacher teacher;
	
	
	
	public TeacherDataView(Teacher t) {
		this.teacher = t;
	
		this.setLayout(layout);
		GridBagConstraints c = new GridBagConstraints();
		
		Controller.frame.getContentPane().removeAll();
		Controller.frame.getContentPane().add(this);
		Controller.frame.pack();
		Controller.frame.setSize(Controller.height, Controller.width);
		
		list.setSelectedIndex(0);
		button2.addActionListener(new BackButtonListener(this));
		button1.addActionListener(new SubmitRequestButtonListener(this));
		
		label1.setText(this.teacher.getFirstName() + " " + this.teacher.getLastName());
		label2.setText(this.teacher.getSkillsAsString());
		label3.setText(this.teacher.getCoursesAsString());
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.gridy = 0;
		c.gridx = 0;
		this.add(label1, c);
		c.gridx = 1;
		this.add(label2, c);
		c.gridx = 2;
		this.add(label3, c);
		
		c.gridy = 1;
		c.gridx = 0;
		this.add(list, c);
		c.gridx = 1;
		this.add(button1, c);
		c.gridx = 2;
		this.add(button2, c);
	}
}
