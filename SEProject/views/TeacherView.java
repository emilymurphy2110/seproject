package views;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.TeacherSubmitListener;
import controller.TeacherUploadListener;

public class TeacherView {
	public JLabel tName, cTitle, cList, rTitle, rList;
	public JButton back, addRequest, reviewRequest;
	public JPanel mainPanel, topPanel, midPanel, bottomPanel, cPanel, rPanel;
	
	public TeacherView() {
		// Create main panel
		mainPanel = new JPanel();
		BorderLayout bLayout = new BorderLayout();
		mainPanel.setLayout(bLayout);
		
		// Create top panel
		topPanel = new JPanel();
		GridLayout gLayout = new GridLayout(3, 0);
		back = new JButton("Back");
		back.addActionListener(controller);
		back.setSize(80, 30);
		topPanel.add(back, 0, 0);
		
		
		// Create classes panel
		cPanel = new JPanel();
		cTitle = new JLabel("CLASSES");
		cList = new JLabel("Class List");
		
		// Create requests panel
		rPanel = new JPanel();
		rTitle = new JLabel("REQUESTS");
		rList = new JLabel("Request List");
		
		// Create Bottom Panel
		bottomPanel = new JPanel();
		bottomPanel.setLayout(gLayout);
		addRequest = new JButton("Add Request");
		addRequest.addActionListener(controller);
		addRequest.setSize(80, 30);
		reviewRequest = new JButton("Review Request");
		reviewRequest.addActionListener(controller);
		reviewRequest.setSize(80,30);
		bottomPanel.add(addRequest, 0, 0);
		bottomPanel.add(reviewRequest, 2, 0);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		
	}

}
