package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;

import views.LoginView;
import views.ScreenSelectionView;

public class LoginController implements ActionListener{
	private model model;
	private LoginView loginView;
	private ScreenSelectionView screenSelectionView;
	private JDialog loginAttempt;
	private JLabel message;
	
	public LoginController(model model) {
		this model = model;
	}
	
	// Create message for unsuccessful login attempt
	public void actionPerformed(ActionEvent e) {
		loginAttempt = new JDialog();
		if(true) {
			screenSelectionView = new ScreenSelectionView();
			loginView.loginScreen.setVisible(false);
		}else {
			message = new JLabel("Login Failed");
			loginAttempt.add(message);	
		}
		
		
//		System.out.println("login button pressed");
//		// Will need to add to permission logic
	
	}
}
