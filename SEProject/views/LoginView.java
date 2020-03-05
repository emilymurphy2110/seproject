package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.Controller;
import controller.Database;
import controller.LoginButtonListener;

public class LoginView extends JPanel {
	//public JPanel loginScreen;
	public JLabel usernameLabel, passwordLabel;
	public JTextField username, password;
	public JButton login;
	
	public LoginView() {
		
		// automatic login
		if(Controller.loginGUI("admin", "admin")) {
			ScreenSelectionView ssv = new ScreenSelectionView();
			Database.init();
		}
		
		this.setSize(Controller.height, Controller.width);
// 		Create JFrame and set details
//		loginScreen = new JFrame();
//		loginScreen.setLayout(null);
//		loginScreen.setSize(400,400); // Set JFrame size
//		loginScreen.setLocation(200,100); // Set JFrame location
//		loginScreen.setTitle("Login"); // Set JFrame title
//		loginScreen.setVisible(true);
//		loginScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		// Create login labels, input fields and button
		usernameLabel = new JLabel("Username");
		passwordLabel = new JLabel("Password");
		username = new JTextField();
		password = new JPasswordField();
		login = new JButton("Login");
		login.addActionListener(new LoginButtonListener(this));
		
		// Set positions and sizes of labels, and then add to frame
		usernameLabel.setBounds(80, 100, 120, 30);
		passwordLabel.setBounds(80, 150, 120, 30);
		username.setBounds(220, 100, 120, 30);
		password.setBounds(220, 150, 120, 30);
		login.setBounds(140,220, 120, 30);
		this.add(usernameLabel);
		this.add(passwordLabel);
		this.add(username);
		this.add(password);
		this.add(login);
		
	}
}
