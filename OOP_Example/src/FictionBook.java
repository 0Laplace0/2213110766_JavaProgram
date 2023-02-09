
public class FictionBook implements AuthorZ,BookZ{

	private String author_name, email, title;
	private int publicYear;
	
	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		if(author_name == (getFirstName() + " " + getLastName())) {
			return true;
		} else {
			return false;
		}
	}
	
	int check = author_name.indexOf(" ");
	
	@Override
	public String getLastName() {
		String firstName = author_name.substring(0, check);
		return firstName;
	}
	
	@Override
	public String getFirstName() {
		String lastName = author_name.substring(check, author_name.length());
		return lastName;
	}
	
	@Override
	public boolean checkEmail() {
		if(email.endsWith("@hotmail.com") || email.endsWith("@windowslive,com")) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public int totalPublicYear() {
		return 2023 - this.publicYear;
	}
	
	public String toString(){
		return this.title + " write by " + getLastName().charAt(0) + "." + getFirstName() + " (" + this.email + ") "
				+ "\nPublished for " + totalPublicYear() + " years.";
	}

}
