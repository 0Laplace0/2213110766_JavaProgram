import javax.swing.*;

public class Lab503 {

	static int inputYear;
	public static void main(String[] args) {
		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input Year"));
		boolean chkYear = checkYear(inputYear);
		while(!checkYear(inputYear)) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000"
					+ "\nInput Year, again"));
		}
		/*if (isLeapYear(inputYear)) {
			JOptionPane.showMessageDialog(null, inputYear + " is Leap Year");
		}else {
			JOptionPane.showMessageDialog(null, inputYear + " is not Leap Year");
		}*/
		JOptionPane.showMessageDialog(null, inputYear + (isLeapYear(inputYear)?" is":" is not") + "Leap Year");
	} //end of main
	
	public static boolean checkYear(int year) {
		
		if (inputYear<1000||inputYear>3000) {
			return true;
		} else {
			return false;
		}
	} //end of checkYear
	
	public static boolean isLeapYear(int year) {
		if((year%4==0) && ((year%100!=0) || (year%400==0))) {
			return true;
		} else {
			return false;
		}
	} //end of isLeapYear

}
