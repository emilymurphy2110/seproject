package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Class;
import model.Skill;
import model.Teacher;
import model.TrainingRequest;
import model.User;

public class Database {
	
	private static ArrayList<User> users = new ArrayList<>();
	private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static ArrayList<Class> classes = new ArrayList<>();
    private static ArrayList<TrainingRequest> requests = new ArrayList<>();
    
    public Database() {
    	
    }
    
    public static void init() {
    	loadTeachers();
    	loadClasses();
    	loadRequests();
    }

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

    public static void loadTeachers(){
    	 String csvFile = "data/TEACHERS.csv";
         String line = "";
         String cvsSplitBy = ",";

         try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
             while ((line = br.readLine()) != null) {
                 String[] vals = line.split(cvsSplitBy);
                 //System.out.println("teacher name " + vals[0]);
                 
                 //create teacher object
                 Teacher t = new Teacher(vals[0].split(" ")[0],vals[0].split(" ")[1], "n/a", "n/a", null);
                 
                 // add skills
                 for(int i = 1; i < vals.length; i++) {
                	 vals[i] = vals[i].replaceAll("\"", "");
                	 vals[i] = vals[i].replaceAll(" ", "");
                	 //System.out.println("teacher skill " + vals[i]);
                	 //System.out.println(vals[i]);
                	 t.addSkill(Skill.getSkillByString(vals[i]));
                 }
                 
                 // add teacher to list
                 teachers.add(t);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
    
    public static void loadClasses(){
   	 String csvFile = "data/COURSES.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] vals = line.split(cvsSplitBy);
                //System.out.println("class name " + vals[0]);
                
                //create class object
                Class c = new Class(vals[0], null);
                
                Skill[] s = new Skill[vals.length-2];
                // add required skills
                for(int i = 1; i < vals.length-1; i++) {
               	 	vals[i] = vals[i].replaceAll("\"", "");
               	 	//System.out.println("required skill " + vals[i]);
               	 	s[i-1] = Skill.getSkillByString(vals[i]);
                }
                
                c.setTeacher(getTeacherByName(vals[vals.length-1]));
                
                // add class to list
                classes.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
    
   public static void loadRequests(){
	   String csvFile = "data/REQUESTS.csv";
       String line = "";
       String cvsSplitBy = ",";

       try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
           while ((line = br.readLine()) != null) {
               String[] vals = line.split(cvsSplitBy);

               Teacher teacher = Database.getTeacherByName(vals[0]);
               Skill skill = Skill.getSkillByString(vals[1]);
               
               TrainingRequest newReq;
               if(vals[2].equals("accepted")) {
            	   newReq = new TrainingRequest(Controller.loggedInUser, teacher, skill);
            	   newReq.answer(Controller.loggedInUser, true);
               } else if(vals[2].equals("declined")) {
            	   newReq = new TrainingRequest(Controller.loggedInUser, teacher, skill);
            	   newReq.answer(Controller.loggedInUser, false);
               } else {
            	   newReq = new TrainingRequest(Controller.loggedInUser, teacher, skill);
               }
               
               Database.addRequest(newReq);
               
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
  }
    
    public static Teacher getTeacherByName(String name) {
    	for(Teacher t : teachers) {
    		if(t.getFirstName().toLowerCase().equals(name.split(" ")[0].toLowerCase()) && 
    				t.getLastName().toLowerCase().equals(name.split(" ")[1].toLowerCase())) {
    			return t;
    		}
    	}
    	return null;
    }


	public static Class[] getClassesByTeacher(Teacher teacher) {
		ArrayList<Class> classes = new ArrayList<>();
		for(Class c : Database.classes) {
//			System.out.println("t1 " + c.getTeacher().getFirstName() + " " + c.getTeacher().getLastName());
//			System.out.println("t2 " + teacher.getFirstName() + " " + teacher.getLastName());
			if(c.getTeacher().getFirstName().equals(teacher.getFirstName()) &&
					c.getTeacher().getLastName().equals(teacher.getLastName())) {
				classes.add(c);
			}
		}
		return classes.toArray(new Class[0]);
	}
	
	public static void addRequest(TrainingRequest tr) {
		requests.add(tr);
		System.out.println("Request added for " + 
		tr.getTeacher().getFirstName() + 
		" skill: " + tr.getTraining().name());
		
		Controller.database.saveRequests();
	}
	
	public static int getNumOfPendingRequestsByTeacher(Teacher t) {
		int count = 0;
		for(TrainingRequest req : requests) {
			if(req.getTeacher().equals(t) && req.getDirectorAnswer() == null) {
				count ++;
			}
		}
		return count;
	}

	public static ArrayList<TrainingRequest> getRequests() {
		return requests;
	}

	public static void setRequests(ArrayList<TrainingRequest> requests) {
		Database.requests = requests;
	}

	public static void setUsers(ArrayList<User> users) {
		Database.users = users;
	}

	public static void setTeachers(ArrayList<Teacher> teachers) {
		Database.teachers = teachers;
	}

	public static void setClasses(ArrayList<Class> classes) {
		Database.classes = classes;
	}
	
	public void writeData(List<String[]> data, String filename) throws IOException {
	    File csvOutputFile = new File(filename);
	    try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
	    	data.stream()
	          .map(this::convertToCSV)
	          .forEach(pw::println);
	    }
	}
	
	public String convertToCSV(String[] data) {
	    return Stream.of(data)
	      .map(this::escapeSpecialCharacters)
	      .collect(Collectors.joining(","));
	}
	
	public String escapeSpecialCharacters(String data) {
	    String escapedData = data.replaceAll("\\R", " ");
	    if (data.contains(",") || data.contains("\"") || data.contains("'")) {
	        data = data.replace("\"", "\"\"");
	        escapedData = "\"" + data + "\"";
	    }
	    return escapedData;
	}
	
	public void saveRequests() {
		List<String[]> dataLines = new ArrayList<>();
		for(TrainingRequest req : requests) {
			if(req.isAccepted()) {
				dataLines.add(new String[] {req.getTeacher().getFullName(), req.getTraining().name(), "accepted"});
			} else if(!req.isAccepted() && req.getDirectorAnswer() != null) {
				dataLines.add(new String[] {req.getTeacher().getFullName(), req.getTraining().name(), "declined"});
			} else {
				dataLines.add(new String[] {req.getTeacher().getFullName(), req.getTraining().name(), "pending"});
			}
		}
        
        try {
			writeData(dataLines, "data/REQUESTS.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
