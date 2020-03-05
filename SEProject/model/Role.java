package model;

import java.util.ArrayList;
import java.util.Arrays;

public enum Role {
	
	PTT_DIRECTOR(new Permission[]{Permission.ADD_ENTRY, Permission.UPDATE_ENTRY, Permission.REMOVE_ENTRY, Permission.VIEW_REQUEST, Permission.ACCEPT_REQUEST, Permission.DENY_REQUEST}),
    CLASS_DIRECTOR(new Permission[]{Permission.ADD_ENTRY, Permission.UPDATE_ENTRY, Permission.REMOVE_ENTRY, Permission.CREATE_REQUEST, Permission.VIEW_REQUEST}),
    ADMINISTRATOR(new Permission[]{Permission.ADD_ENTRY, Permission.UPDATE_ENTRY, Permission.REMOVE_ENTRY,  Permission.VIEW_REQUEST}),
    TEACHER(new Permission[]{Permission.VIEW_REQUEST});

    private ArrayList<Permission> permissions = null;

    Role(Permission[] permissions) {
        this.permissions = new ArrayList(Arrays.asList(permissions));
    }

    public ArrayList<Permission> getPermissions(){
        return this.permissions;
    }
}
