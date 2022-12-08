import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separted by a space.\n:");
		String fullName = scan.nextLine();
		int check = fullName.indexOf(" ");
		String firstName = fullName.substring(0, check);
		System.out.println(abbreviatName(fullName).toUpperCase() + firstName);
		
	} //end of main
	
	public static String abbreviatName(String fullname) {
		String getName = "";
		for(int i = 0; i < fullname.length(); i++) {
			if(fullname.charAt(i) == ' ') {
				getName += fullname.charAt(i + 1);
				getName	+= ".";
			}
		}
		return getName;
	} // end of abbreviatName

}
