package se.customervalue.cvs.api.representation.domain;

import se.customervalue.cvs.domain.Employee;

public class BasicEmployeeRepresentation {
	private int employeeId;

	private String email;

	private String firstName;

	private String lastName;

	private String photoPath;

	public BasicEmployeeRepresentation() {}

	public BasicEmployeeRepresentation(Employee managingEmployee) {
		this.employeeId = managingEmployee.getEmployeeId();
		this.email = managingEmployee.getEmail();
		this.firstName = managingEmployee.getFirstName();
		this.lastName = managingEmployee.getLastName();
		this.photoPath = managingEmployee.getPhotoPath();
	}

	public BasicEmployeeRepresentation(int employeeId, String email, String firstName, String lastName, String photoPath) {
		this.employeeId = employeeId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.photoPath = photoPath;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
}