/**
 * 
 */
package org.dev.emmanuel.cms.services;

import java.util.List;

import org.dev.emmanuel.cms.domain.Patient;

/**
 * @author Emmanuel
 *
 */
public interface PatientServices {
	
	public void addPatient(Patient p);
	public void retrievePatient(String id);
	public Patient updatePatientProfile(Patient p);
	public void removePatient(Patient p);
	public List<Patient> getAllPatients();
	
}
