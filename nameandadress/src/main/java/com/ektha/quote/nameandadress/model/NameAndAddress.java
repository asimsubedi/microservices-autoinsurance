/**
 * 
 */
package com.ektha.quote.nameandadress.model;

/**
 * @author AsimSubedi
 *
 */
public class NameAndAddress {

	private String Id;
	private String firstName;
	private String lastName;
	private String dob;

	private MailingInfo mailingInfo;

	public NameAndAddress() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}

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
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the mailingInfo
	 */
	public MailingInfo getMailingInfo() {
		return mailingInfo;
	}

	/**
	 * @param mailingInfo the mailingInfo to set
	 */
	public void setMailingInfo(MailingInfo mailingInfo) {
		this.mailingInfo = mailingInfo;
	}

	@Override
	public String toString() {
		return "NameAndAddress [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", mailingInfo="
				+ mailingInfo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mailingInfo == null) ? 0 : mailingInfo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NameAndAddress other = (NameAndAddress) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mailingInfo == null) {
			if (other.mailingInfo != null)
				return false;
		} else if (!mailingInfo.equals(other.mailingInfo))
			return false;
		return true;
	}

}
