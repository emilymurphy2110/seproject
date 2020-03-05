package model;

public enum Permission {
	
	  ADD_ENTRY("Add entry"),
	  UPDATE_ENTRY("Update entry"),
	  REMOVE_ENTRY("Remove entry"),
	  CREATE_REQUEST("Create request"),
	  VIEW_REQUEST("View request"),
	  ACCEPT_REQUEST("Accept request"),
	  DENY_REQUEST("Deny request");
	  
	
	private String title;
	
	Permission(String title) {
		this.title = title;
		}
	
	public String getTitle() {
		return title;
		}
}
