package org.dev.emmanuel.cms.domain;

import java.io.Serializable;

public class MedicalRecord implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private String medicalRecordID;
    private String appointmentID;
    private String diagnosis;
    private String prescriptionID;
    private String comments;
    
    
	/**
	 * @return the medicalRecordID
	 */
	public String getMedicalRecordID() {
		return medicalRecordID;
	}
	/**
	 * @param medicalRecordID the medicalRecordID to set
	 */
	public void setMedicalRecordID(String medicalRecordID) {
		this.medicalRecordID = medicalRecordID;
	}
	/**
	 * @return the appointmentID
	 */
	public String getAppointmentID() {
		return appointmentID;
	}
	/**
	 * @param appointmentID the appointmentID to set
	 */
	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}
	/**
	 * @return the diagnosis
	 */
	public String getDiagnosis() {
		return diagnosis;
	}
	/**
	 * @param diagnosis the diagnosis to set
	 */
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	/**
	 * @return the prescriptionID
	 */
	public String getPrescriptionID() {
		return prescriptionID;
	}
	/**
	 * @param prescriptionID the prescriptionID to set
	 */
	public void setPrescriptionID(String prescriptionID) {
		this.prescriptionID = prescriptionID;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
}
