package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import views.LoginView;
import views.ScreenSelectionView;

public class LoginButtonListener implements ActionListener {
	
	private LoginView lv;
	
	public LoginButtonListener(LoginView lv) {
		this.lv = lv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String username = lv.username.getText();
		String password = lv.password.getText();
		boolean success = Controller.loginGUI(username, password);
		if(success) {
			ScreenSelectionView ssv = new ScreenSelectionView();
		  }
		}
		
		
	}


