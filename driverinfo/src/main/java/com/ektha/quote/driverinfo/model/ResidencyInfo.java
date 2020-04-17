/**
 * 
 */
package com.ektha.quote.driverinfo.model;

/**
 * @author AsimSubedi
 *
 */
public class ResidencyInfo {

	private PrimaryResidency primaryResidency;

	public ResidencyInfo() {
	}

	/**
	 * @return the primaryResidency
	 */
	public PrimaryResidency getPrimaryResidency() {
		return primaryResidency;
	}

	/**
	 * @param primaryResidency the primaryResidency to set
	 */
	public void setPrimaryResidency(PrimaryResidency primaryResidency) {
		this.primaryResidency = primaryResidency;
	}

	@Override
	public String toString() {
		return "ResidencyInfo [primaryResidency=" + primaryResidency + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((primaryResidency == null) ? 0 : primaryResidency.hashCode());
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
		ResidencyInfo other = (ResidencyInfo) obj;
		if (primaryResidency != other.primaryResidency)
			return false;
		return true;
	}

}
