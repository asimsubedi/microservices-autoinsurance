/**
 * 
 */
package com.ektha.quote.driverinfo.model;

/**
 * @author AsimSubedi
 *
 */
public class DrivingHistory {

	// the options in list are: valid, suspended, permit, expired, foreignlicence,
	// business etc.
	private String licenceStatus;

	// got licence at what year?
	private int yrsLicenced;

	public DrivingHistory() {
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
	public int getYrsLicenced() {
		return yrsLicenced;
	}

	/**
	 * @param yrsLicenced the yrsLicenced to set
	 */
	public void setYrsLicenced(int yrsLicenced) {
		this.yrsLicenced = yrsLicenced;
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
		result = prime * result + yrsLicenced;
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
		if (yrsLicenced != other.yrsLicenced)
			return false;
		return true;
	}

}
