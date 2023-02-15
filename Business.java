
/**
 * @author sam Kauffman
 *
 */
public class Business extends Building {

	protected int mNumRentableUnit;

	/**
	 * empty constructor
	 */
	public Business() {
		super();
		mNumRentableUnit = 0;
	}// close constructor

	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnit
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnit) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		mNumRentableUnit = numRentableUnit;
	}// close constructor

	/**
	 * @return rentable units
	 */
	public int getNumRentableUnit() {
		return mNumRentableUnit;
	}// close getter

	/**
	 * @param numRentableUnit
	 */
	public void setNumRentableUnit(int numRentableUnit) {
		mNumRentableUnit = numRentableUnit;
	}// close setter
	/**
	 *  Makes to String method
	 */
	public String toString() {
		return "Business [mNumRentableUnit=" + mNumRentableUnit + ", mProjectName=" + mProjectName
				+ ", mCompleteAddress=" + mCompleteAddress + ", mTotalSquareFeet=" + mTotalSquareFeet
				+ ", mOccupancyGroup=" + mOccupancyGroup + ", mSubgroup=" + mSubgroup + "]";
	}

}
