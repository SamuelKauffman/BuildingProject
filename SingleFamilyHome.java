
/**
 * @author sam Kauffman
 *
 */
public class SingleFamilyHome extends Residential {
	private boolean mGarage;

	/**
	 * empty Constructor
	 */
	public SingleFamilyHome() {
		super();
		mGarage = false;
	}

	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 * @param garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
				laundryRoom);
		mGarage = garage;
	}

	/**
	 * draws info
	 */
	public void draw() {
		System.out.println("Information from Single Family Home");
	}

	/**
	 * displays data
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------------------\n");
		sb.append("Project Name: " + mProjectName + "\n");
		sb.append("Address: " + mCompleteAddress + "\n");
		sb.append("Square Feet: " + mTotalSquareFeet + "\n");
		sb.append("Occupancy Group: " + mOccupancyGroup + "\n");
		sb.append("Occupancy Subgroup: " + mSubgroup + "\n");
		sb.append("Bedrooms: " + mNumBedrooms + "\n");
		sb.append("Bathrooms: " + mNumBathrooms + "\n");
		sb.append("Laundry Room: " + mLaundryRoom + "\n");
		sb.append("Garage: " + mGarage + "\n");
		sb.append("-------------------------------\n");

		return sb.toString();
	}

	/**
	 * @return Garage
	 */
	public boolean getGarage() {
		return mGarage;
	}

	/**
	 * @param garage
	 */
	public void setGarage(boolean garage) {
		mGarage = garage;
	}
}
