package model;

import java.util.Scanner;

public class Main {
	
	public static User loggedInUser;
    public static Database database = new Database();

    public static void main(String[] args) {
        database.addUser(new User("Peter","Black","pblack1","sugarbaby123",Role.ADMINISTRATOR));
        database.addUser(new User("John","Green","jwhite1888","catbird555",Role.CLASS_DIRECTOR));
        database.addUser(new User("Victoria","Brown","vbrown321","A3mL35aB3!!klMi345",Role.PTT_DIRECTOR));
        database.addUser(new Teacher("Mark","Yellow","myellow2134","ilovetrucks",Skill.COOKING));
        database.addUser(new Teacher("Holly", "Blue", "hblue2000", "cookie5", Skill.HISTORY, Skill.IT));
        
        database.addClass(new Class("Java Programming", ClassSkillsMatch.JAVA_PROGRAMMING_1));
        database.addClass(new Class("History of Art", ClassSkillsMatch.HISTORY_OF_ART));
        database.addClass(new Class("Cookery", ClassSkillsMatch.COOKERY));
      
        
        login();

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

    public static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name:");
        String un = sc.nextLine();
        System.out.println("Enter password:");
        String pw = sc.nextLine();
        loggedInUser = database.loginUser(un, pw);

        if(loggedInUser != null) System.out.println("Welcome, " + loggedInUser.getFirstName());
        else System.out.println("Nope");
    }

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
  