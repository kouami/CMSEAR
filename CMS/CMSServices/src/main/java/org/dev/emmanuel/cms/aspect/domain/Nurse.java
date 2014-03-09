package org.dev.emmanuel.cms.domain;

public class Nurse extends User {

	@SuppressWarnings("unused")
	private String role; // tbd
	
	@Override
	protected String getRole() {
		return null;
	}

}
