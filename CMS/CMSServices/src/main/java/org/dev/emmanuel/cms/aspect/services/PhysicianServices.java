/**
 * 
 */
package org.dev.emmanuel.cms.services;

import java.util.List;

import org.dev.emmanuel.cms.domain.Physician;

/**
 * @author Emmanuel
 *
 */
public interface PhysicianServices {
	
	public void addPhysician(Physician p);
	public void retrievePhysician(String id);
	public Physician updatePhysicianProfile(Physician p);
	public void removePhysician(Physician p);
	public List<Physician> getAllPhysicians();
	
}
