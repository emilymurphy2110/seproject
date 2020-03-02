package model;

public class Class {
	
	private String title;
    private Skill[] requiredSkills;
    

    public Class(String title, Skill...skills){
        this.title = title;
        this.requiredSkills = skills;
    }
    
	public boolean hasRequiredSkills(Teacher teacher){
        for(Skill s : requiredSkills){
            if(!teacher.hasSkill(s)) return false;
        }
        return true;
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
