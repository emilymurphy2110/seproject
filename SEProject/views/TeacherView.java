package views;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controller.BackButtonListener;
import controller.Controller;
import controller.TeacherSubmitListener;
import controller.TeacherUploadListener;
import model.Database;
import model.Teacher;
import model.User;

public class TeacherView extends JPanel {
	
	private BorderLayout layout = new BorderLayout();
	
	public TeacherView() {
		
		this.setLayout(layout);
		
		Controller.frame.getContentPane().removeAll();
		Controller.frame.getContentPane().add(this);
		Controller.frame.pack();
		Controller.frame.setSize(Controller.height, Controller.width);
		
		
		JButton back = new JButton("Back");
		back.addActionListener(new BackButtonListener(this));
		this.add(back, BorderLayout.PAGE_START);
		JPanel listPanel = new JPanel();
		JScrollPane scrollPane = new JScrollPane(listPanel);
		
		listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
		for(Teacher t : Database.getTeachers()) {
			listPanel.add(new TeacherListItem(t));
		}
		
		listPanel.add(Box.createVerticalGlue());
		this.add(scrollPane, BorderLayout.CENTER);
		
		// Add all components to frame
		
		
	}

}
