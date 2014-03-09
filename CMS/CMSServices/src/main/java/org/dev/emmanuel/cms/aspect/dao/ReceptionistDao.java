/**
 * 
 */
package org.dev.emmanuel.cms.dao;

import org.dev.emmanuel.cms.domain.Receptionist;

/**
 * @author Emmanuel
 *
 */
public interface ReceptionistDao {
	
	public void createReceptionist(Receptionist r);
	public void getReceptionist(String id);
	public Receptionist updateReceptionist(Receptionist r);
	public void deleteReceptionist(Receptionist r);
	
}
