import java.text.*;
import java.util.Scanner;

public class SalespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,##0.00");
		int sales;
		double salary;
		do {
			System.out.print("Enter sales in dollors (or -1 to end): ");
			sales = scan.nextInt();
			if (sales != SENTINEL) {
				salary = 1000 + sales * COMMISSION_RATE;
				System.out.println("Salary i: $" + frm.format(salary));
			}
			else System.out.println("bye");
		}while (sales != SENTINEL);
		
	}

}
