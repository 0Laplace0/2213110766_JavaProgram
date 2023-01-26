
public class Author01 {

	private String name, email;
	
	public Author01(String name, String email) {
		this.name = name;
		this.email = email;
		//this(name, email);
	}
	
	public Author01() {
		this.name = null;
		this.email = null;
		//this(null, null);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return getName() + " (" + getEmail() + ")";
	}
}
