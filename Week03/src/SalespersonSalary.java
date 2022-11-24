import javax.swing.*;
import java.util.Scanner;
import java.text.*;

public class SalespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,##0.00");
		int sales;
		double salary = 0;
		do {
		System.out.print("Enter sales in dollors (or -1 to end): ");
		sales = scan.nextInt();
		if (sales!=-1) {
		salary = 1000 + sales * COMMISSION_RATE;
		System.out.println("Salary is: $" + frm.format(salary));
		}
		else System.out.println("bye\n");
		}while(sales!=-1);
	}

}
