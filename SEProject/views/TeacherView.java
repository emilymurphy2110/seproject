package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.TeacherSubmitListener;
import controller.TeacherUploadListener;

public class TeacherView {
	public JFrame teacherScreen;
	public JLabel teacher1Label, teacher2Label, teacher3Label;
	public JTextField teacher1, teacher2, teacher3, teacher4, teacher5, skills1, skills2, skills3, skills4, skills5, training1, training2, training3, training4, training5;
	public JButton teacherUpload, teacherSubmit;
	
	public TeacherView() {
		// Create JFrame and set details
		teacherScreen = new JFrame();
		teacherScreen.setLayout(null);
		teacherScreen.setSize(800,800); // Set JFrame size
		teacherScreen.setLocation(200,100); // Set JFrame location
		teacherScreen.setTitle("Teachers"); // Set JFrame title
		teacherScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create teacher labels and set Location and Size
		teacher1Label = new JLabel("Teacher Name");
		teacher1Label.setBounds(200, 20, 120, 60);
		teacher2Label = new JLabel("Skills");
		teacher2Label.setBounds(400, 20, 120, 60);
		teacher3Label = new JLabel("Training");
		teacher3Label.setBounds(600, 20, 120, 60);
		
		// Create Teacher list items and set location and size
		teacher1 = new JTextField();
		teacher1.setBounds(200, 210, 120, 30); 
		teacher2 = new JTextField();
		teacher2.setBounds(200, 250, 120, 30);
		teacher3 = new JTextField();
		teacher3.setBounds(200, 290, 120, 30);
		teacher4 = new JTextField();
		teacher4.setBounds(200, 330, 120, 30);
		teacher5 = new JTextField();
		teacher5.setBounds(200, 370, 120, 30);
		
		// Create Skills list and set location and size
		skills1 = new JTextField();
		skills1.setBounds(400, 210, 120, 30); 
		skills2 = new JTextField();
		skills2.setBounds(400, 250, 120, 30);
		skills3 = new JTextField();
		skills3.setBounds(400, 290, 120, 30);
		skills4 = new JTextField();
		skills4.setBounds(400, 330, 120, 30);
		skills5 = new JTextField();
		skills5.setBounds(400, 370, 120, 30);
		
		// Create Skills list and set location and size
		training1 = new JTextField();
		training1.setBounds(600, 210, 120, 30); 
		training2 = new JTextField();
		training2.setBounds(600, 250, 120, 30);
		training3 = new JTextField();
		training3.setBounds(600, 290, 120, 30);
		training4 = new JTextField();
		training4.setBounds(600, 330, 120, 30);
		training5 = new JTextField();
		training5.setBounds(600, 370, 120, 30);
		
		// Create Teacher buttons and set location and size
		teacherUpload = new JButton("Upload");
		teacherUpload.setBounds(40, 20, 120, 30);
		teacherUpload.addActionListener(new TeacherUploadListener());
		teacherSubmit = new JButton("Submit");
		teacherSubmit.setBounds(40, 70, 120, 30);
		teacherSubmit.addActionListener(new TeacherSubmitListener());
		
		// Add all components to frame
		teacherScreen.add(teacher1Label);
		teacherScreen.add(teacher2Label);
		teacherScreen.add(teacher3Label);
		
		teacherScreen.add(teacherUpload);
		teacherScreen.add(teacherSubmit);
		
		teacherScreen.add(teacher1);
		teacherScreen.add(teacher2);
		teacherScreen.add(teacher3);
		teacherScreen.add(teacher4);
		teacherScreen.add(teacher5);
		
		teacherScreen.add(skills1);
		teacherScreen.add(skills2);
		teacherScreen.add(skills3);
		teacherScreen.add(skills4);
		teacherScreen.add(skills5);
		
		teacherScreen.add(training1);
		teacherScreen.add(training2);
		teacherScreen.add(training3);
		teacherScreen.add(training4);
		teacherScreen.add(training5);
		
	}

}
