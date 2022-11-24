import javax.swing.*;
import java.text.*;

public class SalespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,##0.00");
		int sales;
		double salary = 0;
		do {
		sales = Integer.parseInt(JOptionPane.showInputDialog("Enter sales in dollors (or -1 to end): "));
		if (sales!=-1) {
		salary = 1000 + sales * COMMISSION_RATE;
		JOptionPane.showMessageDialog(null, "Salary is: $" + frm.format(salary));
		}
		else JOptionPane.showMessageDialog(null, "bye");
		}while(sales!=-1);
	}

}
