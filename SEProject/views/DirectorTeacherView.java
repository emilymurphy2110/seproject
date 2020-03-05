package views;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.BackButtonListener;
import controller.Controller;
import controller.Database;
import model.Teacher;
import model.TrainingRequest;

public class DirectorTeacherView extends JPanel {
	
	private BorderLayout layout = new BorderLayout();
	
	public DirectorTeacherView() {
		
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
		
		for(TrainingRequest t : Database.getRequests()) {
			listPanel.add(new DirectorTeacherViewItem(t),0);
		}
		
		listPanel.add(Box.createVerticalGlue());
		this.add(scrollPane, BorderLayout.CENTER);
		
	}

}
