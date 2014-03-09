package org.dev.emmanuel.cms.services;

import java.util.List;

import org.dev.emmanuel.cms.domain.Nurse;

/**
 * @author Emmanuel
 *
 */
public interface NurseServices {
	
	public void addNurse(Nurse n);
	public void retrieveNurse(String id);
	public Nurse updateNurseProfile(Nurse n);
	public void removeNurse(Nurse n);
	public List<Nurse> getAllNurses();
	
}
