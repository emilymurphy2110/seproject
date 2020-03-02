package Core;

import java.util.ArrayList;

public class Database {
	
	private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Class> classes = new ArrayList<>();

    public User loginUser(String username, String password){
        for(User u : users){
            if(u.getUserName().equals(username) && u.getPassword().equals(Hasher.hashPassword(password))){
                return u;
            }
        }

        return null;
    }

    public static ArrayList<Class> getClasses() {
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
