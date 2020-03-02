package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Teacher extends User {

	private ArrayList<Skill> skills = new ArrayList<>();

    public Teacher(String firstName, String lastName, String userName, String password, Skill... skills) {
        super(firstName, lastName, userName, password, Role.TEACHER);
        this.skills = new ArrayList<Skill>(Arrays.asList(skills));
    }

    public void addSkill(Skill skill){
        this.skills.add(skill);
    }

    public boolean hasSkill(Skill s){
        return skills.contains(s);
    }
}
