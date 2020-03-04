package views;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.AcceptButtonListener;
import controller.Database;
import controller.DeclineButtonListener;
import model.Teacher;
import model.TrainingRequest;

public class DirectorTeacherViewItem extends JPanel {
	public JLabel name;
	public JButton accept;
	public JButton decline;
	private TrainingRequest req;
	
	public DirectorTeacherViewItem(TrainingRequest req) {
		super();
		
		this.req = req;
		this.name = new JLabel(req.getTeacher().getFullName() + "    " + req.getTraining().name());
		
		this.accept = new JButton("Accept");
		this.decline = new JButton("Decline");
		
		this.accept.setBackground(Color.green);
		this.decline.setBackground(Color.red);
		
		accept.addActionListener(new AcceptButtonListener(req, this));
		decline.addActionListener(new DeclineButtonListener(req, this));
		
		this.add(name);
		this.add(accept);
		this.add(decline);
		
		if(req.isAccepted()) {
			remove(accept);
			remove(decline);
			name.setText(name.getText() + "    ACCEPTED   ");
			name.setForeground(Color.GREEN.darker().darker());
		} else if(req.getDirectorAnswer() != null && !req.isAccepted()){
			remove(accept);
			remove(decline);
			name.setText(name.getText() + "    DECLINED   ");
			name.setForeground(Color.RED.darker());
		}
	}	
}
