package model;

import java.util.ArrayList;

public class Database {
	
	private static ArrayList<User> users = new ArrayList<>();
	private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static ArrayList<Class> classes = new ArrayList<>();
    private static ArrayList<TrainingRequest> requests = new ArrayList<>();

    public User loginUser(String username, String password){
        for(User u : users){
            if(u.getUserName().equals(username) && u.getPassword().equals(Hasher.hashPassword(password))){
                return u;
            }
        }

        return null;
    }
    
    public static void addTeacher(Teacher t) {
    	teachers.add(t);
    }
    
    public static ArrayList<Teacher> getTeachers() {
    	return teachers;
    }
    
    public static ArrayList<User> getUsers() {
    	return users;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void addClass(Class c){
        classes.add(c);
    }

    public void addUser(User u){
        users.add(u);
    }

    public void loadData(){
        //load data from disk
    }

    public void saveData(){
        //save data to disk
    }

}
