/**
 * 
 */
package org.dev.emmanuel.cms.dao;

import org.dev.emmanuel.cms.domain.Patient;

/**
 * @author Emmanuel
 *
 */
public interface PatientDao {
	
	public void createPatient(Patient p);
	public void getPatient(String id);
	public Patient updatePatient(Patient p);
	public void deletePatient(Patient p);
	
}
