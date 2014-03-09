package org.dev.emmanuel.cms.domain;

import java.io.Serializable;

public class Prescription implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String prescriptionID;
    private String prescriptionTypeID;
    private String prescriptionName;
    
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
	 * @return the prescriptionTypeID
	 */
	public String getPrescriptionTypeID() {
		return prescriptionTypeID;
	}
	/**
	 * @param prescriptionTypeID the prescriptionTypeID to set
	 */
	public void setPrescriptionTypeID(String prescriptionTypeID) {
		this.prescriptionTypeID = prescriptionTypeID;
	}
	/**
	 * @return the prescriptionName
	 */
	public String getPrescriptionName() {
		return prescriptionName;
	}
	/**
	 * @param prescriptionName the prescriptionName to set
	 */
	public void setPrescriptionName(String prescriptionName) {
		this.prescriptionName = prescriptionName;
	}
}
