package org.dev.emmanuel.cms.domain;

public abstract class User {
	
	//private Credentials credentials;
    private int employeeID;
    private String firstName;
    private String lastName;
    //private EmployeeRole role;
    private String address;
    private String contactNumber;
    private String SIN;
    private String managerID;
    private String permissionFlag;
    private String departmentId;
    private String gender;
    private String userName;
	/**
	 * @return the employeeID
	 */
	protected int getEmployeeID() {
		return employeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	protected void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	/**
	 * @return the firstName
	 */
	protected String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	protected String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	protected String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	protected void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the contactNumber
	 */
	protected String getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	protected void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the sIN
	 */
	protected String getSIN() {
		return SIN;
	}
	/**
	 * @param sIN the sIN to set
	 */
	protected void setSIN(String sIN) {
		SIN = sIN;
	}
	/**
	 * @return the managerID
	 */
	protected String getManagerID() {
		return managerID;
	}
	/**
	 * @param managerID the managerID to set
	 */
	protected void setManagerID(String managerID) {
		this.managerID = managerID;
	}
	/**
	 * @return the permissionFlag
	 */
	protected String getPermissionFlag() {
		return permissionFlag;
	}
	/**
	 * @param permissionFlag the permissionFlag to set
	 */
	protected void setPermissionFlag(String permissionFlag) {
		this.permissionFlag = permissionFlag;
	}
	/**
	 * @return the departmentId
	 */
	protected String getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	protected void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the gender
	 */
	protected String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	protected void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the userName
	 */
	protected String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	protected void setUserName(String userName) {
		this.userName = userName;
	}
    
	protected abstract String getRole();
}
