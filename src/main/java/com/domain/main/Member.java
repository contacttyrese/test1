package com.domain.main;

import java.util.ArrayList;

public class Member extends User {
	
	private ArrayList<String> languagesSpoken;
	private String userBiography;
	private String userPicture;
	private String role;
	
	public Member(int memberId, String username, String dateOfBirth, String emailAddress, ArrayList<String> languagesSpoken, String userBiography, String userPicture){
		super(memberId, username, dateOfBirth, emailAddress);
		this.languagesSpoken = languagesSpoken;
		this.userBiography = userBiography;
		this.userPicture = userPicture;
		this.role = "member";
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

	public String getUserPicture() {
		return userPicture;
	}

	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
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
		result = prime * result + ((userBiography == null) ? 0 : userBiography.hashCode());
		result = prime * result + ((userPicture == null) ? 0 : userPicture.hashCode());
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
		Member other = (Member) obj;
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
		if (userBiography == null) {
			if (other.userBiography != null)
				return false;
		} else if (!userBiography.equals(other.userBiography))
			return false;
		if (userPicture == null) {
			if (other.userPicture != null)
				return false;
		} else if (!userPicture.equals(other.userPicture))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [userId=" + getUserId() +
				", userusername=" + getUsername() +
				", dateOfBirth=" + getDateOfBirth() +
				", emailAddress=" + getEmailAddress() +
				", languagesSpoken=" + languagesSpoken +
				", userBiography=" + userBiography +
				", userPicture=" + userPicture +
				", role=" + role + "]";
	}

}
