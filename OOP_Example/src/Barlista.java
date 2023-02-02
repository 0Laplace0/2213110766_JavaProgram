
public class Barlista{

	private String name;
	private char gender;
	
	public Barlista() {
		this.name = name;
		this.gender = gender;
	}
	
	public Barlista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenderName() {
		if(gender == 'm') {
			return "Male";
		}else if(gender == 'f') {
			return "Female";
		}else {
			return " ";
		}
	}
	
}
