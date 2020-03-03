package views;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	public Window() {
		JFrame window = new JFrame();
		window.setLayout(null);
		window.setSize(600,600); // Set JFrame size
		window.setLocation(200,100); // Set JFrame location
		window.setTitle("Teaching Requests"); // Set JFrame title
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

		
	}
}
