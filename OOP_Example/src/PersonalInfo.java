
public class PersonalInfo {

	private Person name;
	private Date bDay;
	private int personID;
	
	// Default Constructor
	public PersonalInfo() {
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	
	//Constructor with parameter
	public PersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name = new Person(first, last);
		bDay = new Date(month, day, year);
		personID = ID;
	}
	
	//Method to set the personal information
	public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	
	//Method to return the personal information
	public String toString() {
		return "Name : " + name.toString() + 
				"\nDate of birth : " + bDay.toString() + 
				"\nPersonal ID : " + personID;
	}

}
