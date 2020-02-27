package Core;

import java.util.ArrayList;
import java.util.Arrays;

public enum Role {
	
	PTT_DIRECTOR(new Permission[]{Permission.ADD_ENTRY, Permission.REMOVE_ENTRY, Permission.ACCEPT_REQUEST}),
    CLASS_DIRECTOR(new Permission[]{Permission.ADD_ENTRY, Permission.REMOVE_ENTRY, Permission.VIEW_REQUEST}),
    ADMINISTRATOR(new Permission[]{Permission.ADD_ENTRY, Permission.REMOVE_ENTRY}),
    TEACHER(new Permission[]{Permission.VIEW_REQUEST});

    private ArrayList<Permission> permissions = null;

    Role(Permission[] permissions) {
        this.permissions = new ArrayList(Arrays.asList(permissions));
    }

    public ArrayList<Permission> getPermissions(){
        return this.permissions;
    }
}
