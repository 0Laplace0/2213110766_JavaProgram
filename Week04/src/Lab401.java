import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		if(!fullName.contains(" ")) {
			System.out.println("Incorrect Name");
		}
		else {
			int check = fullName.indexOf(" ");
			String firstName = fullName.substring(0, check).toUpperCase();
			String lastName = fullName.substring(check, fullName.length()).toLowerCase();
			System.out.println("First Name : " + firstName);
			System.out.println("Last Name : " + lastName.trim());
		}

	}

}
