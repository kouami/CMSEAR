/**
 * 
 */
package org.dev.emmanuel.cms.dao;

import org.dev.emmanuel.cms.domain.Nurse;

/**
 * @author Emmanuel
 *
 */
public interface NurseDao {
	
	public void createNurse(Nurse n);
	public void getNurse(String id);
	public Nurse updateNurse(Nurse n);
	public void deleteNurse(Nurse n);
	
}
