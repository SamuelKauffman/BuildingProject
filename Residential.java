
public class Residential extends Building {
	protected int mNumBedrooms;
	protected int mNumBathrooms;
	protected boolean mLaundryRoom;

	public Residential() {
		super();
		mNumBedrooms = 0;
		mNumBathrooms = 0;
		mLaundryRoom = false;
	}

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		mNumBedrooms = numBedrooms;
		mNumBathrooms = numBathrooms;
		mLaundryRoom = laundryRoom;
	}

	public int getmNumBedrooms() {
		return mNumBedrooms;
	}

	public void setmNumBedrooms(int mNumBedrooms) {
		this.mNumBedrooms = mNumBedrooms;
	}

	public int getmNumBathrooms() {
		return mNumBathrooms;
	}

	public void setmNumBathrooms(int mNumBathrooms) {
		this.mNumBathrooms = mNumBathrooms;
	}

	public boolean getmLaundryRoom() {
		return mLaundryRoom;
	}

	public void setmLaundryRoom(boolean mLaundryRoom) {
		this.mLaundryRoom = mLaundryRoom;
	}
	/**
	 *  Makes to String method
	 */
	public String toString() {
		return "Residential [mNumBedrooms=" + mNumBedrooms + ", mNumBathrooms=" + mNumBathrooms + ", mLaundryRoom="
				+ mLaundryRoom + ", mProjectName=" + mProjectName + ", mCompleteAddress=" + mCompleteAddress
				+ ", mTotalSquareFeet=" + mTotalSquareFeet + ", mOccupancyGroup=" + mOccupancyGroup + ", mSubgroup="
				+ mSubgroup + "]";
	}

}
