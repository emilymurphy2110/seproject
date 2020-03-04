package model;

public class Class {
	
	private String title;
    private Skill[] requiredSkills;
    private Teacher teacher;
    

    public Class(String title, Teacher teacher, Skill...skills){
        this.title = title;
        this.teacher = teacher;
        this.requiredSkills = skills;
    }
    
	public boolean hasRequiredSkills(Teacher teacher){
        for(Skill s : requiredSkills){
            if(!teacher.hasSkill(s)) return false;
        }
        return true;
    }

	
	
    public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
        return title;
    }
    
    public Skill[] getRequiredSkills() {
		return requiredSkills;
	}

	public void setRequiredSkills(Skill[] requiredSkills) {
		this.requiredSkills = requiredSkills;
	}



}
