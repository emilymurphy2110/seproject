package views;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.RequirementsButtonListener;
import controller.TeacherButtonListener;

public class ScreenSelectionView {
	public JFrame selectionScreen;
	public JPanel panel;
	public JButton teacherButton, requirementsButton;
	
	public ScreenSelectionView() {
		// Create JFrame and set details
		selectionScreen = new JFrame();
		selectionScreen.setSize(400,400); // Set JFrame size
		selectionScreen.setLocation(200,100); // Set JFrame location
		selectionScreen.setTitle("Selection"); // Set JFrame title
		selectionScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		// Create Panels and Buttons (with actionListeners)
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		teacherButton = new JButton("View Teachers, Skills and Training");
		teacherButton.addActionListener(new TeacherButtonListener());
		requirementsButton = new JButton("View or Review Teaching Requirements");
		requirementsButton.addActionListener(new RequirementsButtonListener());
				
		// Add buttons to panel, and panel to JFrame
		panel.add(teacherButton);
		panel.add(requirementsButton);
		selectionScreen.add(panel);	
	}
}
