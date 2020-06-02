/**
 * 
 */
package com.ektha.quote.driverinfo.model;

import java.io.Serializable;

/**
 * @author AsimSubedi
 *
 */
public class DrivingHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String licenceStatus;

	private String yrsLicenced;

	public DrivingHistory() {
	}

	public DrivingHistory(String licenceStatus, String yrsLicenced) {
		this.licenceStatus = licenceStatus;
		this.yrsLicenced = yrsLicenced;
	}
	
	

	/**
	 * @return the licenceStatus
	 */
	public String getLicenceStatus() {
		return licenceStatus;
	}

	/**
	 * @param licenceStatus the licenceStatus to set
	 */
	public void setLicenceStatus(String licenceStatus) {
		this.licenceStatus = licenceStatus;
	}

	/**
	 * @return the yrsLicenced
	 */
	public String getYrsLicenced() {
		return yrsLicenced;
	}

	/**
	 * @param yrsLicenced the yrsLicenced to set
	 */
	public void setYrsLicenced(String yrsLicenced) {
		this.yrsLicenced = yrsLicenced;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DrivingHistory [licenceStatus=" + licenceStatus + ", yrsLicenced=" + yrsLicenced + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((licenceStatus == null) ? 0 : licenceStatus.hashCode());
		result = prime * result + ((yrsLicenced == null) ? 0 : yrsLicenced.hashCode());
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
		DrivingHistory other = (DrivingHistory) obj;
		if (licenceStatus == null) {
			if (other.licenceStatus != null)
				return false;
		} else if (!licenceStatus.equals(other.licenceStatus))
			return false;
		if (yrsLicenced == null) {
			if (other.yrsLicenced != null)
				return false;
		} else if (!yrsLicenced.equals(other.yrsLicenced))
			return false;
		return true;
	}

}
