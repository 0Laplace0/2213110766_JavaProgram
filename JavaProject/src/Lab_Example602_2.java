import javax.swing.*;

public class Lab_Example602_2 {

	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean deptWasFound = false;
	public static void main(String[] args) {
		String dept = JOptionPane.showInputDialog("Enter a department name");
		
		for(int i=0; i<deptName.length; i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		}
		
		if(deptWasFound) {
			JOptionPane.showMessageDialog(null, dept + " was found in the list");
		} else {
			JOptionPane.showMessageDialog(null, dept + " was not found in the list");
		}

	}

}
