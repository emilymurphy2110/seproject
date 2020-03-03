package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RequirementsView {
	public JFrame requirementsScreen;
	public JLabel r1Label, r2Label, r3Label;
	public JTextField requirement1, requirement2, requirement3, requirement4, requirement5, rt1, rt2, rt3, rt4, rt5;
	public JButton rUpload, rSubmit, approve1, approve2, approve3, approve4, approve5, reject1, reject2, reject3, reject4, reject5;

	public RequirementsView() {
		// Create JFrame and set details
		requirementsScreen = new JFrame();
		requirementsScreen.setLayout(null);
		requirementsScreen.setSize(800,800); // Set JFrame size
		requirementsScreen.setLocation(200,100); // Set JFrame location
		requirementsScreen.setTitle("Requirements"); // Set JFrame title
		requirementsScreen.setVisible(true);
		requirementsScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create teacher labels and set Location and Size
		r1Label = new JLabel("Requirements");
		r1Label.setBounds(200, 20, 120, 60);
		r2Label = new JLabel("Teachers");
		r2Label.setBounds(400, 20, 120, 60);
		r3Label = new JLabel("Review");
		r3Label.setBounds(600, 20, 120, 60);
		
		// Create Requirement list items and set location and size
		requirement1 = new JTextField();
		requirement1.setBounds(200, 210, 120, 30); 
		requirement2 = new JTextField();
		requirement2.setBounds(200, 250, 120, 30);
		requirement3 = new JTextField();
		requirement3.setBounds(200, 290, 120, 30);
		requirement4 = new JTextField();
		requirement4.setBounds(200, 330, 120, 30);
		requirement5 = new JTextField();
		requirement5.setBounds(200, 370, 120, 30);
		
		// Create teacher list and set location and size
		rt1 = new JTextField();
		rt1.setBounds(400, 210, 120, 30); 
		rt2 = new JTextField();
		rt2.setBounds(400, 250, 120, 30);
		rt3 = new JTextField();
		rt3.setBounds(400, 290, 120, 30);
		rt4 = new JTextField();
		rt4.setBounds(400, 330, 120, 30);
		rt5 = new JTextField();
		rt5.setBounds(400, 370, 120, 30);
	}
}
