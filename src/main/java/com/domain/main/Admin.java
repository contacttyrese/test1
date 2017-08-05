package com.domain.main;

import java.util.ArrayList;

public class Admin extends User {
	
	private ArrayList<String> languagesSpoken;
	private String userBiography;
	private String userPicture;
	private String role;
	
	public Admin(int adminId, String username, String dateOfBirth, String emailAddress, ArrayList<String> languagesSpoken, String userBiography, String userPicture){
		super(adminId, username, dateOfBirth, emailAddress);
		this.languagesSpoken = languagesSpoken;
		this.userBiography = "Not_Required";
		this.userPicture = "Not_Required";
		this.role = "admin";
	}

	public ArrayList<String> getLanguagesSpoken() {
		return languagesSpoken;
	}

	public void setLanguagesSpoken(ArrayList<String> languagesSpoken) {
		this.languagesSpoken = languagesSpoken;
	}

	public String getUserBiography() {
		return userBiography;
	}

	public void setUserBiography(String userBiography) {
		this.userBiography = userBiography;
	}

	public String getRole() {
		return role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((getDateOfBirth() == null) ? 0 : getDateOfBirth().hashCode());
		result = prime * result + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
		result = prime * result + getUserId();
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		result = prime * result + ((languagesSpoken == null) ? 0 : languagesSpoken.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (getDateOfBirth() == null) {
			if (other.getDateOfBirth() != null)
				return false;
		} else if (!getDateOfBirth().equals(other.getDateOfBirth()))
			return false;
		if (getEmailAddress() == null) {
			if (other.getEmailAddress() != null)
				return false;
		} else if (!getEmailAddress().equals(other.getEmailAddress()))
			return false;
		if (getUserId() != other.getUserId())
			return false;
		if (getUsername() == null) {
			if (other.getUsername() != null)
				return false;
		} else if (!getUsername().equals(other.getUsername()))
			return false;
		if (languagesSpoken == null) {
			if (other.languagesSpoken != null)
				return false;
		} else if (!languagesSpoken.equals(other.languagesSpoken))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin [userId=" + getUserId() +
				", userusername=" + getUsername() +
				", dateOfBirth=" + getDateOfBirth() +
				", emailAddress=" + getEmailAddress() +
				", languagesSpoken=" + languagesSpoken +
				", userBiography=" + userBiography +
				", userPicture=" + userPicture +
				", role=" + role + "]";
	}

}
