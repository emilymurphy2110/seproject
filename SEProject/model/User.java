package model;

import java.util.ArrayList;

import controller.Hasher;

public class User {
	
	private String firstName = "firstName", lastName = "lastName", userName = "userName", password;

    private Role role;
    private ArrayList<Permission> perms = new ArrayList<>();

    public User(String firstName, String lastName, String userName, String password, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = Hasher.hashPassword(password);
        this.role = role;
        this.perms = this.role.getPermissions();
    }

    public boolean hasPermission(Permission permission){
        return this.perms.contains(permission);
    }

    public boolean hasPermissions(Permission... permissions){
        for(Permission p : permissions){
            if(!this.hasPermission(p)) return false;
        }
        return true;
    }

    public void addPermission(Permission permission){
        this.perms.add(permission);
    }

    public void removePermission(Permission permission){
        this.perms.remove(permission);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public ArrayList<Permission> getPerms() {
        return perms;
    }

}
