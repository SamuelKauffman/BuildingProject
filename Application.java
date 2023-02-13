
/**
 * @author Sam Kauffman
 * @version 1.0
 * 
 * Application for the Building UML diagram. displays information about each property.
 * 
 *
 */
public class Application {

	public static void main(String[] args) {
		Building data = new Building();
		data.setProjectName("Building");
		data.getProjectName();
		data.setCompleteAddress("123 BuildingAddy");
		data.getCompleteAddress();
		data.setTotalSquareFeet(10000);
		data.getTotalSquareFeet();
		data.setOccupancyGroup("N/A");
		data.getOccupancyGroup();
		data.setSubgroup("N/A");
		data.getSubgroup();
		System.out.println(data.displayData());
		
		Business data1 = new Business();
		data1.setProjectName("Business");
		data1.getProjectName();
		data1.setCompleteAddress("123 BuisnessAddy");
		data1.getCompleteAddress();
		data1.setTotalSquareFeet(50000);
		data1.getTotalSquareFeet();
		data1.setOccupancyGroup("Business");
		data1.getOccupancyGroup();
		data1.setSubgroup("Group B");
		data1.getSubgroup();
		data1.setNumRentableUnit(10);
		data1.getNumRentableUnit();
		
		Residential data2 = new Residential();
		data2.setProjectName("Resident");
		data2.getProjectName();
		data2.setCompleteAddress("123 ResidentialAddy");
		data2.getCompleteAddress();
		data2.setTotalSquareFeet(130000);
		data2.getTotalSquareFeet();
		data2.setOccupancyGroup("Residential");
		data2.getOccupancyGroup();
		data2.setSubgroup("Group R1-R4");
		data2.getSubgroup();
		data2.setmNumBedrooms(4);
		data2.getmNumBedrooms();
		data2.setmNumBathrooms(2);
		data2.setmLaundryRoom(true);
		data2.getmLaundryRoom();
		
		Mall data3 = new Mall();
		data3.setProjectName("Mall");
		data3.getProjectName();
		data3.setCompleteAddress("123 MallAddy");
		data3.getCompleteAddress();
		data3.setTotalSquareFeet(50000);
		data3.getTotalSquareFeet();
		data3.setOccupancyGroup("Mercantile");
		data3.getOccupancyGroup();
		data3.setSubgroup("Group M");
		data3.getSubgroup();
		data3.setNumRentableUnit(10);
		data3.getNumRentableUnit();
		data3.setRentedUnits(2);
		data3.getRentedUnits();
		data3.setMedianUnitSize(120);
		data3.getMedianUnitSize();
		data3.setNumParkingSpaces(270);
		data3.getNumParkingSpaces();
		System.out.println(data3.displayData());
		
		Apartment data4 = new Apartment();
		data4.setProjectName("Apartment");
		data4.getProjectName();
		data4.setCompleteAddress("123 ApartmentAddy");
		data4.getCompleteAddress();
		data4.setTotalSquareFeet(20000);
		data4.getTotalSquareFeet();
		data4.setOccupancyGroup("Residential");
		data4.getOccupancyGroup();
		data4.setSubgroup("Group R-2");
		data4.getSubgroup();
		data4.setmNumBedrooms(4);
		data4.getmNumBedrooms();
		data4.setmNumBathrooms(2);
		data4.setmLaundryRoom(true);
		data4.getmLaundryRoom();
		data4.setmNumRentableUnits(0);
		data4.getmNumRentableUnits();
		data4.setmAvgUnitSize(10000);
		data4.setParkingAvailable(true);
		data4.getmLaundryRoom();
		System.out.println(data4.displayData());
		
		SingleFamilyHome data5 = new SingleFamilyHome();
		data5.setProjectName("Home");
		data5.getProjectName();
		data5.setCompleteAddress("123 HomeAddy");
		data5.getCompleteAddress();
		data5.setTotalSquareFeet(130000);
		data5.getTotalSquareFeet();
		data5.setOccupancyGroup("Residential");
		data5.getOccupancyGroup();
		data5.setSubgroup("Group R-1");
		data5.getSubgroup();
		data5.setmNumBedrooms(4);
		data5.getmNumBedrooms();
		data5.setmNumBathrooms(2);
		data5.setmLaundryRoom(true);
		data5.getmLaundryRoom();
		data5.getmLaundryRoom();
		data5.setGarage(false);
		data5.getGarage();
		System.out.println(data5.displayData());
	}//end of Main

}//end of class
