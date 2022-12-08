import java.util.Scanner;

public class Lab505 {

	public static void main(String[] args) {
		inputStudent();
		//displayData();

	} //end of main
	static String studentId;
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		studentId = scan.nextLine();
		System.out.print("Enter Subject Id: ");
		String subjectId = scan.nextLine();
		boolean check = isLength(studentId, subjectId);
		while(check == true) {
			System.out.print("Enter Student Id: ");
			studentId = scan.nextLine();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.nextLine();
		}
		boolean checkStdId = isITStudent(studentId);
		boolean checkSjId = isITSubject(subjectId);
	} //end of inputStudent
	
	public static boolean isLength(String stdId, String sjId) {
		if(stdId.length() != 10 && sjId.length() != 7) {
			return true;
		} else {
			return false;
		}
	} //end of isLenght //finish
	
	public static boolean isITStudent(String stdId) {
		if (stdId.charAt(2) == '1' && (stdId.indexOf("311" ,3) == 3)) {
			return true;
		} else {
			return false;
		}
		
	} //end of isITStudent //finish
	
	public static boolean isITSubject(String sjId) {
		if (sjId.indexOf("21") == 0 && sjId.indexOf("1" ,4) == 4) {
			return true;
		} else {
			return false;
		}
	} //end of isITSubject 
	
	public static void displayData(boolean chStId, boolean chSjId) {
		String stdTxt = "", sjTxt = "";
		boolean checkStdId = (chStId == true)? stdTxt == "" :stdTxt == "is not ";
		boolean checkSjId = (chSjId == true)? sjTxt == "Enroll" :sjTxt == "not enroll";
		System.out.println();
		System.out.println("Student id: " + studentId + stdTxt + "1st year student in IT"
				+ sjTxt + "in courses for Year 1");
	}

}