
/**
 * @author sam Kauffman
 *
 */
public class Mall extends Business {
	private int mRentedUnits;
	private double mMedianUnitSize;
	private int mNumParkingSpaces;

	/**
	 * empty constructor
	 */
	public Mall() {
		super();
		mRentedUnits = 0;
		mMedianUnitSize = 0;
		mNumParkingSpaces = 0;
	}//close constructor

	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnit
	 * @param medianUnitSize
	 * @param numParkingSpaces
	 * @param numRentedUnits
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnit, int medianUnitSize, int numParkingSpaces, int numRentedUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnit);
		mRentedUnits = numRentedUnits;
		mMedianUnitSize = medianUnitSize;
		mNumParkingSpaces = numParkingSpaces;
	}

	/**
	 *
	 */
	public void draw() {
		System.out.println("Information from Mall");
	}

	/**
	 *
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------------------\n");
		sb.append("Project Name: " + mProjectName + "\n");
		sb.append("Address: " + mCompleteAddress + "\n");
		sb.append("Square Feet: " + mTotalSquareFeet + "\n");
		sb.append("Occupancy Group: " + mOccupancyGroup + "\n");
		sb.append("Occupancy Subgroup: " + mSubgroup + "\n");
		sb.append("Rentable units: " + mNumRentableUnit + "\n");
		sb.append("Rented Units: " + mRentedUnits + "\n");
		sb.append("Unit Size: " + mMedianUnitSize + "\n");
		sb.append("Parking Spaces: " + mNumParkingSpaces + "\n");
		sb.append("-------------------------------\n");

		return sb.toString();
	}
	
	public int getRentedUnits() {
		return mRentedUnits;
	}
	
	public void setRentedUnits(int rentedUnits) {
		mRentedUnits = rentedUnits;
	}

	/**
	 * @return
	 */
	public double getMedianUnitSize() {
		return mMedianUnitSize;
	}

	/**
	 * @param mMedianUnitSize
	 */
	public void setMedianUnitSize(double mMedianUnitSize) {
		this.mMedianUnitSize = mMedianUnitSize;
	}

	/**
	 * @return
	 */
	public int getNumParkingSpaces() {
		return mNumParkingSpaces;
	}

	/**
	 * @param mNumParkingSpaces
	 */
	public void setNumParkingSpaces(int mNumParkingSpaces) {
		this.mNumParkingSpaces = mNumParkingSpaces;
	}

}
