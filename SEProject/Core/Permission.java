package Core;

public enum Permission {
	
	  ADD_ENTRY("Add entry"),
	    UPDATE_ENTRY("Update entry"),
	    REMOVE_ENTRY("Remove entry"),
	    ACCEPT_REQUEST("..."),
	    VIEW_REQUEST("...");

	    private String title;

	    Permission(String title) {
	        this.title = title;
	    }

	    public String getTitle() {
	        return title;
	    }

}
