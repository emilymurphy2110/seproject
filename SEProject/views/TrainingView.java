package views;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class TrainingView {
	public JPanel mainPanel, topPanel, middlePanel, bottomPanel;
	public JComboBox tList;
	public JButton back, submit;
	
	public TrainingView() {
		// Create main panel
		mainPanel = new JPanel();
		BorderLayout bLayout = new BorderLayout();
		mainPanel.setLayout(bLayout);
		
		// Create top panel and add to main panel
		topPanel = new JPanel();
		GridLayout gLayout = new GridLayout(4,0);
		topPanel.setLayout(gLayout);
		back = new JButton("Back");
		back.addActionListener(controller);
		back.setSize(80, 30);
		topPanel.add(back, 0,0);
		mainPanel.add(topPanel, BorderLayout.NORTH);
		
		// Create middle panel and add to main
		middlePanel = new JPanel();
		middlePanel.setLayout(bLayout);
//		String[] classList = ();
		tList = new JComboBox(classList);
		submit = new JButton("Submit");
		submit.addActionListener(controller);
		submit.setSize(80,30);
		middlePanel.add(submit, BorderLayout.SOUTH);
		middlePanel.add(tList, BorderLayout.CENTER);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		
		
		
		
	}

}
