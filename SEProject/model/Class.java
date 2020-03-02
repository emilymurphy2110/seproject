package model;

public class Class {
	
	private String title;
    private Skill[] requiredSkills;
    private ClassSkillsMatch classSkills;

    public Class(String title, ClassSkillsMatch classSkills){
        this.title = title;
        this.classSkills = classSkills;
    }
    
    public void classSkills(ClassSkillsMatch classSkills) {
    	this.classSkills = classSkills;
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

}
