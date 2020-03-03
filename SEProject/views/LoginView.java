package views;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;

import controller.LoginController;

public class LoginView extends Window {
	public JLabel welcomeLabel;
	public JButton login;
	public JPanel view; 
	public LoginController controller;
	public Window window;
	
	public LoginView() {
		String[] role = {"Administrator", "PTT Director"};
		view = new JPanel();
		view.setSize(600, 600);
		welcomeLabel = new JLabel("Please select your role");
		login = new JButton("Login");
    //Tom ActionListener
		login.addActionListener(controller);
		JComboBox selection = new JComboBox(role);
		selection.addActionListener(controller);

    //Emilys ActionListener
		//login.addActionListener(new LoginButtonListener(this));

		
		// Set positions and sizes of labels, and then add to frame
		welcomeLabel.setBounds(200, 100, 200, 30);
		selection.setBounds(200, 150, 200, 30);
		login.setBounds(200 ,200, 200, 30);
//		view.add(welcomeLabel);
//		view.add(login);
//		view.add(selection);
	}
	
}
