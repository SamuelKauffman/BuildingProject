
/**
 * @author sam Kauffman
 *
 */
public class Building {
	protected String mProjectName;
	protected String mCompleteAddress;
	protected double mTotalSquareFeet;
	protected String mOccupancyGroup;
	protected String mSubgroup;

	/**
	 * empty constructor
	 */
	public Building() {
		mProjectName = "";
		mCompleteAddress = "";
		mTotalSquareFeet = 0;
		mOccupancyGroup = "";
		mSubgroup = "";
	}// close constructor

	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		mProjectName = projectName;
		mCompleteAddress = completeAddress;
		mTotalSquareFeet = totalSquareFeet;
		mOccupancyGroup = occupancyGroup;
		mSubgroup = subgroup;
	}// close constructor

	/**
	 * prints info
	 */
	public void draw() {
		System.out.println("Information from Building");
	}// close method

	/**
	 * @return data
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------------------\n");
		sb.append("Project Name:" + mProjectName + "\n");
		sb.append("Address:" + mCompleteAddress + "\n");
		sb.append("Square Feet:" + mTotalSquareFeet + "\n");
		sb.append("Occupancy Group: " + mOccupancyGroup + "\n");
		sb.append("Occupancy Subgroup: " + mSubgroup + "\n");
		sb.append("-------------------------------\n");

		return sb.toString();
	}// close method

	/**
	 * @return project name
	 */
	public String getProjectName() {
		return mProjectName;
	}// close getter

	/**
	 * @param mProjectName
	 */
	public void setProjectName(String mProjectName) {
		this.mProjectName = mProjectName;
	}// close setter

	/**
	 * @return address
	 */
	public String getCompleteAddress() {
		return mCompleteAddress;
	}// close getter

	/**
	 * @param mCompleteAddress
	 */
	public void setCompleteAddress(String mCompleteAddress) {
		this.mCompleteAddress = mCompleteAddress;
	}// close setter

	/**
	 * @return sq feet
	 */
	public double getTotalSquareFeet() {
		return mTotalSquareFeet;
	}// close getter

	/**
	 * @param mTotalSquareFeet
	 */
	public void setTotalSquareFeet(double mTotalSquareFeet) {
		this.mTotalSquareFeet = mTotalSquareFeet;
	}// close stter

	/**
	 * @return occupancy group
	 */
	public String getOccupancyGroup() {
		return mOccupancyGroup;
	}// close getter

	/**
	 * @param mOccupancyGroup
	 */
	public void setOccupancyGroup(String mOccupancyGroup) {
		this.mOccupancyGroup = mOccupancyGroup;
	}// close setter

	/**
	 * @return sub group
	 */
	public String getSubgroup() {
		return mSubgroup;
	}// close getter

	/**
	 * @param mSubgroup
	 */
	public void setSubgroup(String mSubgroup) {
		this.mSubgroup = mSubgroup;
	}// close setter
	/**
	 *  Makes to String method
	 */
	public String toString() {
		return "Building [mProjectName=" + mProjectName + ", mCompleteAddress=" + mCompleteAddress
				+ ", mTotalSquareFeet=" + mTotalSquareFeet + ", mOccupancyGroup=" + mOccupancyGroup + ", mSubgroup="
				+ mSubgroup + "]";
	}

}
