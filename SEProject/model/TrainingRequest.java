package model;

public class TrainingRequest {
	private User submittedBy;
	private Teacher teacher;
	private User directorAnswer;
	private boolean accepted;
	private Skill training;
	
	public TrainingRequest(User submittedBy, Teacher teacher, Skill training) {
		super();
		this.submittedBy = submittedBy;
		this.teacher = teacher;
		this.training = training;
	}
	
	public void answer(User user, boolean answer) {
		this.directorAnswer = user;
		this.accepted = answer;
	}

	public User getSubmittedBy() {
		return submittedBy;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public User getDirectorAnswer() {
		return directorAnswer;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public Skill getTraining() {
		return training;
	}
	
	
}
