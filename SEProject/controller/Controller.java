package controller;

import java.util.Scanner;

import javax.swing.SwingUtilities;

import model.Class;
import model.Database;
import model.Role;
import model.Skill;
import model.Teacher;
import model.User;
import views.LoginView;

public class Controller {
	
	public static User loggedInUser;
    public static Database database = new Database();

    public static void main(String[] args) {
    	database.addUser(new User("admin","admin","admin","admin",Role.ADMINISTRATOR));
        database.addUser(new User("Peter","Black","pblack1","sugarbaby123",Role.ADMINISTRATOR));
        database.addUser(new User("John","Green","jwhite1888","catbird555",Role.CLASS_DIRECTOR));
        database.addUser(new User("Victoria","Brown","vbrown321","A3mL35aB3!!klMi345",Role.PTT_DIRECTOR));
        database.addUser(new Teacher("Mark","Yellow","myellow2134","ilovetrucks",Skill.COOKING));
        database.addUser(new Teacher("Holly", "Blue", "hblue2000", "cookie5", Skill.HISTORY, Skill.IT));
        
        database.addClass(new Class("Java Programming 1", Skill.COOKING, Skill.IT));
        database.addClass(new Class("Java Programming 2", Skill.COOKING, Skill.IT));
        database.addClass(new Class("PHP programming", Skill.HISTORY, Skill.IT));
        database.addClass(new Class("Cooking", Skill.COOKING));
      
        
        //login();
        
        SwingUtilities.invokeLater(new Runnable() {
        	
        	@Override
        	public void run() {
        		LoginView lv = new LoginView();
        	}
        });

        if(loggedInUser instanceof Teacher){
            for (Class c : database.getClasses()){
                if(c.hasRequiredSkills((Teacher) loggedInUser)){
                    System.out.println("You can teach " + c.getTitle());
                } else {
                    System.out.println("You cannot teach " + c.getTitle());
                }
            }
        }
    }

    // CLI Login for testing
    public static void loginCLI(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name:");
        String un = sc.nextLine();
        System.out.println("Enter password:");
        String pw = sc.nextLine();
        loggedInUser = database.loginUser(un, pw);

        if(loggedInUser != null) System.out.println("Welcome, " + loggedInUser.getFirstName());
        else System.out.println("Nope");
    }
   
    public static boolean loginGUI(String username, String password) {
    	loggedInUser = database.loginUser(username, password);
    	return loggedInUser != null;
    }

    // createUser method used in testing
    public static User createUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String fn = sc.nextLine();
        System.out.println("Enter last name:");
        String ln = sc.nextLine();
        System.out.println("Enter user name:");
        String un = sc.nextLine();
        System.out.println("Enter password:");
        String pw = sc.nextLine();
        return new User(fn,ln,un,pw,Role.ADMINISTRATOR);
  }
	
	

}
