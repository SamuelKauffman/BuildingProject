
/**
 * @author sam Kauffman
 *
 */
public class Apartment extends Residential {

	private int mNumRentableUnits;
	private double mAvgUnitSize;
	private boolean mParkingAvailable;

	/**
	 * empty constructor
	 */
	public Apartment() {
		super();
		mNumRentableUnits = 0;
		mAvgUnitSize = 0;
		mParkingAvailable = false;
	}// finish constructor

	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 * @param numRentableUnits
	 * @param avgUnitSize
	 * @param parkingAvailable
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits,
			double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
				laundryRoom);
		mNumRentableUnits = numRentableUnits;
		mAvgUnitSize = avgUnitSize;
		mParkingAvailable = parkingAvailable;
	}// finish constructor

	/**
	 * prints statement
	 */
	public void draw() {
		System.out.println("Information from Apartment");
	}// close

	/**
	 * Prints data
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
		sb.append("Rentable Units: " + mNumRentableUnits + "\n");
		sb.append("Average Unit Size: " + mAvgUnitSize + "\n");
		sb.append("Parking Available: " + mParkingAvailable + "\n");
		sb.append("-------------------------------\n");

		return sb.toString();

	}// close data

	/**
	 * @return rentable units
	 */
	public int getmNumRentableUnits() {
		return mNumRentableUnits;
	}// close getter

	/**
	 * @param mNumRentableUnits
	 */
	public void setmNumRentableUnits(int mNumRentableUnits) {
		this.mNumRentableUnits = mNumRentableUnits;
	}// close setter

	/**
	 * @return returns average unit size
	 */
	public double getmAvgUnitSize() {
		return mAvgUnitSize;
	}// close getter

	/**
	 * @param mAvgUnitSize
	 */
	public void setmAvgUnitSize(double mAvgUnitSize) {
		this.mAvgUnitSize = mAvgUnitSize;
	}// close setter

	/**
	 * @return parkingAvailable
	 */
	public boolean getParkingAvailable() {
		return mParkingAvailable;
	}// close getter

	/**
	 * @param parkingAvailable
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.mParkingAvailable = parkingAvailable;
	}// close setter

	/**
	 *  Makes to String method
	 */
	public String toString() {
		return "Apartment [mNumRentableUnits=" + mNumRentableUnits + ", mAvgUnitSize=" + mAvgUnitSize
				+ ", mParkingAvailable=" + mParkingAvailable + ", mNumBedrooms=" + mNumBedrooms + ", mNumBathrooms="
				+ mNumBathrooms + ", mLaundryRoom=" + mLaundryRoom + ", mProjectName=" + mProjectName
				+ ", mCompleteAddress=" + mCompleteAddress + ", mTotalSquareFeet=" + mTotalSquareFeet
				+ ", mOccupancyGroup=" + mOccupancyGroup + ", mSubgroup=" + mSubgroup + "]";
	}//close toString
}
