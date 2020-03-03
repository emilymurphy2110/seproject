package views;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ApprovalsView {
	public JPanel mainPanel, topPanel, midPanel;
	public JLabel tName, rTitle, req1, req2, req3, req4, req5;
	public JButton back, rej1, rej2, rej3, rej4, rej5, app1, app2, app3, app4, app5;
	
	public ApprovalsView () {
		// Create main Panel
		mainPanel = new JPanel();
		BorderLayout bLayout = new BorderLayout();
		mainPanel.setLayout(bLayout);
		
		// Create top panel and add to main
		topPanel = new JPanel();
		GridLayout gLayout1 = new GridLayout(3, 0);
		topPanel.setLayout(gLayout1);
		back = new JButton("Back");
		back.setSize(80, 30);
		tName = new JLabel("Teacher 1");
		tName.setSize(120, 30);
		topPanel.add(back, 0, 0);
		topPanel.add(tName, 1, 0);
		mainPanel.add(topPanel, BorderLayout.NORTH);
		
		// Create middle panel 
		midPanel = new JPanel();
		GridLayout gLayout2 = new GridLayout(4, 6);
		midPanel.setLayout(gLayout2);
		rTitle = new JLabel("REQUESTS");
		midPanel.add(rTitle, 0, 0);
		
		// Create request titles and add to mid panel
		req1 = new JLabel("Request 1");
		midPanel.add(req1, 0, 1);
		req2 = new JLabel("Request 2");
		midPanel.add(req2, 0, 2);
		req3 = new JLabel("Request 3");
		midPanel.add(req3, 0, 3);
		req4 = new JLabel("Request 4");
		midPanel.add(req4, 0, 4);
		req5 = new JLabel("Request 5");
		midPanel.add(req5, 0, 5);
		
		
		// Create buttons and add to mid panel
		rej1 = new JButton("Reject");
		rej1.addActionListener(controller);
		rej1.setSize(80, 30);
		rej2 = new JButton("Reject");
		rej2.addActionListener(controller);
		rej2.setSize(80, 30);
		rej3 = new JButton("Reject");
		rej3.addActionListener(controller);
		rej3.setSize(80, 30);
		rej4 = new JButton("Reject");
		rej4.addActionListener(controller);
		rej4.setSize(80, 30);
		rej5 = new JButton("Reject");
		rej5.addActionListener(controller);
		rej5.setSize(80, 30);
		
		midPanel.add(rej1, 3, 1);
		midPanel.add(rej2, 3, 2);
		midPanel.add(rej3, 3, 3);
		midPanel.add(rej4, 3, 4);
		midPanel.add(rej5, 3, 5);
		
		app1 = new JButton("Approve");
		app1.addActionListener(controller);
		app1.setSize(80, 30);
		app2 = new JButton("Approve");
		app2.addActionListener(controller);
		app2.setSize(80, 30);
		app3 = new JButton("Approve");
		app3.addActionListener(controller);
		app3.setSize(80, 30);
		app4 = new JButton("Approve");
		app4.addActionListener(controller);
		app4.setSize(80, 30);
		app5 = new JButton("Approve");
		app5.addActionListener(controller);
		app5.setSize(80, 30);
		
		midPanel.add(app1, 4, 1);
		midPanel.add(app2, 4, 2);
		midPanel.add(app3, 4, 3);
		midPanel.add(app4, 4, 4);
		midPanel.add(app5, 4, 5);
		
		mainPanel.add(midPanel, BorderLayout.CENTER);
	
	}
}
