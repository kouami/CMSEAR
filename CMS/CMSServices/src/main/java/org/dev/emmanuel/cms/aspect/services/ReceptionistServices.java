/**
 * 
 */
package org.dev.emmanuel.cms.services;

import java.util.List;

import org.dev.emmanuel.cms.domain.Receptionist;

/**
 * @author Emmanuel
 *
 */
public interface ReceptionistServices {
	
	public void addReceptionist(Receptionist r);
	public void retrieveReceptionist(String id);
	public Receptionist updateReceptionistProfile(Receptionist r);
	public void removeReceptionist(Receptionist r);
	public List<Receptionist> getAllReceptionists();
	
}
