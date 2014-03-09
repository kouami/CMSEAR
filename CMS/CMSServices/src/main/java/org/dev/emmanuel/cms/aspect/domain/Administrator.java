package org.dev.emmanuel.cms.domain;

public class Administrator extends User {

	@SuppressWarnings("unused")
	private String role; // tbd
	
	@Override
	protected String getRole() {
		return null;
	}

}
