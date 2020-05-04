/**
 * 
 */
package com.ektha.quote.driverinfo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author AsimSubedi
 *
 */
@Entity
@Table(name = "tbl_driver")
public class Driver implements Serializable{
	private static final long serialVersionUID = -1663285509218856904L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy ="org.hibernate.id.UUIDGenerator")
	private String id;

	@Column(name = "gender")
	private String gender;
	
	@Column(name = "marital_status")
	private String maritalStatus;
	
	@Column(name = "education")
	private String education;
	
	@Column(name = "ssn")
	private String ssn;

	@Embedded
	private ResidencyInfo residencyInfo;
	
	@Embedded
	private DrivingHistory drivingHistory;

	public Driver() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the residencyInfo
	 */
	public ResidencyInfo getResidencyInfo() {
		return residencyInfo;
	}

	/**
	 * @param residencyInfo the residencyInfo to set
	 */
	public void setResidencyInfo(ResidencyInfo residencyInfo) {
		this.residencyInfo = residencyInfo;
	}

	/**
	 * @return the drivingHistory
	 */
	public DrivingHistory getDrivingHistory() {
		return drivingHistory;
	}

	/**
	 * @param drivingHistory the drivingHistory to set
	 */
	public void setDrivingHistory(DrivingHistory drivingHistory) {
		this.drivingHistory = drivingHistory;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", education="
				+ education + ", ssn=" + ssn + ", residencyInfo=" + residencyInfo + ", drivingHistory=" + drivingHistory
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drivingHistory == null) ? 0 : drivingHistory.hashCode());
		result = prime * result + ((education == null) ? 0 : education.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + ((residencyInfo == null) ? 0 : residencyInfo.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
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
		Driver other = (Driver) obj;
		if (drivingHistory == null) {
			if (other.drivingHistory != null)
				return false;
		} else if (!drivingHistory.equals(other.drivingHistory))
			return false;
		if (education == null) {
			if (other.education != null)
				return false;
		} else if (!education.equals(other.education))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (residencyInfo == null) {
			if (other.residencyInfo != null)
				return false;
		} else if (!residencyInfo.equals(other.residencyInfo))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

}
