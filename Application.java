
/**
 * @author Sam Kauffman
 * @version 1.0
 * 
 *          Application for the Building UML diagram. displays information about
 *          each property.
 * 
 *
 */
public class Application {

	public static void main(String[] args) {
		Building data = new Building();
		System.out.println(data);
		data.setProjectName("Building");
		System.out.println(data.getProjectName());
		data.setCompleteAddress("123 BuildingAddy");
		System.out.println(data.getCompleteAddress());
		data.setTotalSquareFeet(10000);
		System.out.println(data.getTotalSquareFeet());
		data.setOccupancyGroup("N/A");
		System.out.println(data.getOccupancyGroup());
		data.setSubgroup("N/A");
		System.out.println(data.getSubgroup());
		System.out.println(data.displayData());

		Business data1 = new Business();
		System.out.println(data1);
		data1.setProjectName("Business");
		System.out.println(data1.getProjectName());
		data1.setCompleteAddress("123 BuisnessAddy");
		System.out.println(data1.getCompleteAddress());
		data1.setTotalSquareFeet(50000);
		System.out.println(data1.getTotalSquareFeet());
		data1.setOccupancyGroup("Business");
		System.out.println(data1.getOccupancyGroup());
		data1.setSubgroup("Group B");
		System.out.println(data1.getSubgroup());
		data1.setNumRentableUnit(10);
		System.out.println(data1.getNumRentableUnit());

		Residential data2 = new Residential();
		System.out.println(data2);
		data2.setProjectName("Resident");
		System.out.println(data2.getProjectName());
		data2.setCompleteAddress("123 ResidentialAddy");
		System.out.println(data2.getCompleteAddress());
		data2.setTotalSquareFeet(130000);
		System.out.println(data2.getTotalSquareFeet());
		data2.setOccupancyGroup("Residential");
		System.out.println(data2.getOccupancyGroup());
		data2.setSubgroup("Group R1-R4");
		System.out.println(data2.getSubgroup());
		data2.setmNumBedrooms(4);
		System.out.println(data2.getmNumBedrooms());
		data2.setmNumBathrooms(2);
		System.out.println(data2.getmNumBathrooms());
		data2.setmLaundryRoom(true);
		System.out.println(data2.getmLaundryRoom());

		Mall data3 = new Mall();
		System.out.println(data3);
		data3.setProjectName("Mall");
		System.out.println(data3.getProjectName());
		data3.setCompleteAddress("123 MallAddy");
		System.out.println(data3.getCompleteAddress());
		data3.setTotalSquareFeet(50000);
		System.out.println(data3.getTotalSquareFeet());
		data3.setOccupancyGroup("Mercantile");
		System.out.println(data3.getOccupancyGroup());
		data3.setSubgroup("Group M");
		System.out.println(data3.getSubgroup());
		data3.setNumRentableUnit(10);
		System.out.println(data3.getNumRentableUnit());
		data3.setRentedUnits(2);
		System.out.println(data3.getRentedUnits());
		data3.setMedianUnitSize(120);
		System.out.println(data3.getMedianUnitSize());
		data3.setNumParkingSpaces(270);
		System.out.println(data3.getNumParkingSpaces());
		System.out.println(data3.displayData());

		Apartment data4 = new Apartment();
		System.out.println(data4);
		data4.setProjectName("Apartment");
		System.out.println(data4.getProjectName());
		data4.setCompleteAddress("123 ApartmentAddy");
		System.out.println(data4.getCompleteAddress());
		data4.setTotalSquareFeet(20000);
		System.out.println(data4.getTotalSquareFeet());
		data4.setOccupancyGroup("Residential");
		System.out.println(data4.getOccupancyGroup());
		data4.setSubgroup("Group R-2");
		System.out.println(data4.getSubgroup());
		data4.setmNumBedrooms(4);
		System.out.println(data4.getmNumBedrooms());
		data4.setmNumBathrooms(2);
		System.out.println(data4.getmNumBathrooms());
		data4.setmLaundryRoom(true);
		System.out.println(data4.getmLaundryRoom());
		data4.setmNumRentableUnits(0);
		System.out.println(data4.getmNumRentableUnits());
		data4.setmAvgUnitSize(10000);
		System.out.println(data4.getmAvgUnitSize());
		data4.setParkingAvailable(true);
		System.out.println(data4.getParkingAvailable());
		System.out.println(data4.getmLaundryRoom());
		System.out.println(data4.displayData());

		SingleFamilyHome data5 = new SingleFamilyHome();
		System.out.println(data5);
		data5.setProjectName("Home");
		System.out.println(data5.getProjectName());
		data5.setCompleteAddress("123 HomeAddy");
		System.out.println(data5.getCompleteAddress());
		data5.setTotalSquareFeet(130000);
		System.out.println(data5.getTotalSquareFeet());
		data5.setOccupancyGroup("Residential");
		System.out.println(data5.getOccupancyGroup());
		data5.setSubgroup("Group R-1");
		System.out.println(data5.getSubgroup());
		data5.setmNumBedrooms(4);
		System.out.println(data5.getmNumBedrooms());
		data5.setmNumBathrooms(2);
		System.out.println(data5.getmNumBathrooms());
		data5.setmLaundryRoom(true);
		System.out.println(data5.getmLaundryRoom());
		data5.setGarage(false);
		System.out.println(data5.getGarage());
		System.out.println(data5.displayData());
	}// end of Main

}// end of class
