package model;

import java.util.ArrayList;
import java.util.Arrays;

import controller.Database;

public class Teacher extends User {

	private ArrayList<Skill> skills = new ArrayList<>();

    public Teacher(String firstName, String lastName, String userName, String password, Skill... skills) {
        super(firstName, lastName, userName, password, Role.TEACHER);
        if(skills!=null) {
        	this.skills = new ArrayList<Skill>(Arrays.asList(skills));
        } 
       
    }
    
    
    public String getFullName() {
    	return this.getFirstName() + " " + this.getLastName();
    }
    
    public void addSkill(Skill skill){
        this.skills.add(skill);
    }

    public boolean hasSkill(Skill s){
        return skills.contains(s);
    }

	public String getSkillsAsString() {
		String s = "";
		for(Skill sk : skills) {
			s+=(sk.name() + "  ");
		}
		return s;
	}
	
	public String getCoursesAsString() {
		String s = "";
		for(Class c : Database.getClassesByTeacher(this)) {
			s+=(c.getTitle() + "  ");
		}
		return s;
	}
}
