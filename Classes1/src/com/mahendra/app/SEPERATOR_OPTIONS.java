package com.mahendra.app;


// Create a SET OF CONSTANTS 
public enum SEPERATOR_OPTIONS {
	SIMPLE("-"),SLASH("/"),REVERSE("\\");
	
	private String value;
	SEPERATOR_OPTIONS(String value) {
		this.value=value;
	}
	
	public String toString() {
		return value;
	}
	
}
