package org.dev.emmanuel.cms.domain;

import java.io.Serializable;

public class Patient implements Serializable {

	private static final long serialVersionUID = -9059480111536800152L;
	
	private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String contactNumber;
    //private String healthCardNumber;
    private String allergyDetails;
    private String height;
    private String weight;
    private String SIN;
    private String noOfVisits;
    private String defaultDoctorID;
    
    
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the allergyDetails
	 */
	public String getAllergyDetails() {
		return allergyDetails;
	}
	/**
	 * @param allergyDetails the allergyDetails to set
	 */
	public void setAllergyDetails(String allergyDetails) {
		this.allergyDetails = allergyDetails;
	}
	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}
	/**
	 * @return the sIN
	 */
	public String getSIN() {
		return SIN;
	}
	/**
	 * @param sIN the sIN to set
	 */
	public void setSIN(String sIN) {
		SIN = sIN;
	}
	/**
	 * @return the noOfVisits
	 */
	public String getNoOfVisits() {
		return noOfVisits;
	}
	/**
	 * @param noOfVisits the noOfVisits to set
	 */
	public void setNoOfVisits(String noOfVisits) {
		this.noOfVisits = noOfVisits;
	}
	/**
	 * @return the defaultDoctorID
	 */
	public String getDefaultDoctorID() {
		return defaultDoctorID;
	}
	/**
	 * @param defaultDoctorID the defaultDoctorID to set
	 */
	public void setDefaultDoctorID(String defaultDoctorID) {
		this.defaultDoctorID = defaultDoctorID;
	}
}
