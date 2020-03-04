package views;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Controller;
import controller.RequirementsButtonListener;
import controller.TeacherButtonListener;

public class ScreenSelectionView extends JPanel {
	public JButton teacherButton, requirementsButton;
	
	
	public ScreenSelectionView() {
		// Create JFrame and set details
//		selectionScreen = new JFrame();
		 // Set JFrame size
//		selectionScreen.setLocation(200,100); // Set JFrame location
//		selectionScreen.setTitle("Selection"); // Set JFrame title
//		selectionScreen.setVisible(true);
//		selectionScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		// Create Panels and Buttons (with actionListeners)
		
		Controller.frame.getContentPane().removeAll();
		Controller.frame.getContentPane().add(this);
		Controller.frame.pack();
		Controller.frame.setSize(Controller.height, Controller.width);
		
		this.setLayout(new GridLayout(0,2));
		teacherButton = new JButton("View Teachers, Skills and Training");
		teacherButton.addActionListener(new TeacherButtonListener());
		requirementsButton = new JButton("View or Review Teaching Requirements");
		requirementsButton.addActionListener(new RequirementsButtonListener());
				
		// Add buttons to panel, and panel to JFrame
		this.add(teacherButton);
		this.add(requirementsButton);	
	}
}
