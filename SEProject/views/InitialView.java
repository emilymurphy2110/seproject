package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InitialView {
	public JPanel mainPanel, tPanel1, tPanel2, tPanel3, tPanel4, tPanel5;
	public JButton back, edit1, edit2, edit3, edit4, edit5;
	public JLabel tName1, tName2, tName3, tName4, tName5, cList1, cList2, cList3, cList4, cList5, tRequest1, tRequest2, tRequest3, tRequest4, tRequest5;
	
	public InitialView() {
		// Testing with JFrame
		JFrame window = new JFrame();
//		window.setLayout(null);
		window.setSize(1200, 1200); // Set JFrame size
//		window.setLocation(200,100); // Set JFrame location
		window.setTitle("Teaching Requests"); // Set JFrame title
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		mainPanel = new JPanel();
//		mainPanel.setSize(1200, 1200);
		back = new JButton("Back");
//		back.addActionListener(viewController);
		GridBagLayout layout = new GridBagLayout();
		GridBagLayout layout2 = new GridBagLayout();
		GridBagConstraints cons = new GridBagConstraints();
		mainPanel.setLayout(layout);
		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.gridx = 0;
		cons.gridy = 0;
		mainPanel.add(back, cons);
		
		
		// Create first teacher panel
		tPanel1 = new JPanel();
//		tPanel1.setSize(400,150);
		tPanel1.setLayout(layout2);
		tName1 = new JLabel("Teacher Name 1");
		cList1 = new JLabel("Class List");
		tRequest1 = new JLabel("7 Training Requests (4 pending)");
		edit1 = new JButton("Edit / View Requests");
//		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.gridx = 0;
		cons.gridy = 0;
		tPanel1.add(tName1, cons);
		cons.gridx = 0;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel1.add(cList1, cons);
		cons.gridx = 3;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel1.add(tRequest1, cons);
		cons.gridx = 6;
		cons.gridy = 1;
		tPanel1.add(edit1, cons);
		
		// Create second teacher panel
		tPanel2 = new JPanel();
//		tPanel2.setSize(400,150);
		tPanel2.setLayout(layout2);
		tName2 = new JLabel("Teacher Name 2");
		cList2 = new JLabel("Class List");
		tRequest2 = new JLabel("7 Training Requests (4 pending)");
		edit2 = new JButton("Edit / View Requests");
//		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.gridx = 0;
		cons.gridy = 0;
		tPanel2.add(tName2, cons);
		cons.gridx = 0;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel2.add(cList2, cons);
		cons.gridx = 3;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel2.add(tRequest2, cons);
		cons.gridx = 6;
		cons.gridy = 1;
		tPanel2.add(edit2, cons);
		
		// Create third teacher panel
		tPanel3 = new JPanel();
//		tPanel3.setSize(400,150);
		tPanel3.setLayout(layout2);
		tName3 = new JLabel("Teacher Name 3");
		cList3 = new JLabel("Class List");
		tRequest3 = new JLabel("7 Training Requests (4 pending)");
		edit3 = new JButton("Edit / View Requests");
//		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.gridx = 0;
		cons.gridy = 0;
		tPanel3.add(tName3, cons);
		cons.gridx = 0;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel3.add(cList3, cons);
		cons.gridx = 3;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel3.add(tRequest3, cons);
		cons.gridx = 6;
		cons.gridy = 1;
		tPanel3.add(edit3, cons);
		
		// Create fourth teacher panel
		tPanel4 = new JPanel();
//		tPanel4.setSize(400,150);
		tPanel1.setLayout(layout2);
		tName4 = new JLabel("Teacher Name 4");
		cList4 = new JLabel("Class List");
		tRequest4 = new JLabel("7 Training Requests (4 pending)");
		edit4 = new JButton("Edit / View Requests");
//		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.gridx = 0;
		cons.gridy = 0;
		tPanel4.add(tName4, cons);
		cons.gridx = 0;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel4.add(cList4, cons);
		cons.gridx = 3;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel4.add(tRequest4, cons);
		cons.gridx = 6;
		cons.gridy = 1;
		tPanel4.add(edit4, cons);
		
		// Create fifth teacher panel
		tPanel5 = new JPanel();
//		tPanel5.setSize(400,150);
		tPanel5.setLayout(layout2);
		tName5 = new JLabel("Teacher Name 5");
		cList5 = new JLabel("Class List");
		tRequest5 = new JLabel("7 Training Requests (4 pending)");
		edit5 = new JButton("Edit / View Requests");
//		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.gridx = 0;
		cons.gridy = 0;
		tPanel5.add(tName5, cons);
		cons.gridx = 0;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel5.add(cList5, cons);
		cons.gridx = 3;
		cons.gridy = 1;
		cons.gridwidth = 3;
		tPanel5.add(tRequest5, cons);
		cons.gridx = 6;
		cons.gridy = 1;
		tPanel5.add(edit5, cons);
		
		// Add teacher panels to the main panel
		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.gridx = 0;
		cons.gridy = 1;
		cons.gridwidth = 6;
		cons.gridheight = 3;
		mainPanel.add(tPanel1, cons);
//		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.gridx = 0;
		cons.gridy = 6;
		cons.gridwidth = 6;
		cons.gridheight = 3;
		mainPanel.add(tPanel2, cons);
		cons.gridheight = 3;
//		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.gridx = 0;
		cons.gridy = 11;
		cons.gridwidth = 6;
		cons.gridheight = 3;
//		cons.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(tPanel3, cons);
		cons.gridx = 0;
		cons.gridy = 16;
		cons.gridwidth = 6;
		cons.gridheight = 3;
		mainPanel.add(tPanel4, cons);
		cons.gridx = 0;
		cons.gridy = 21;
		cons.gridwidth = 6;
		cons.gridheight = 3;
		mainPanel.add(tPanel5, cons);
		
		window.add(mainPanel);
		
		
		
	}
	
}
