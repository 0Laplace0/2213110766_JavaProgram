import java.util.*;
import java.text.DecimalFormat;

public class Lab102 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product in basket : ");
		int unit = scan.nextInt();
		System.out.println();
		System.out.println("You have " + unit + " unit in basket.");
		int paid = unit;
		int free = 0;
		if(unit/2==0) {
			free++; 
			unit--;
			}
		
		System.out.println("Paid " + unit + " unit.");
		System.out.println("Free " + free + " unit.");

	}

}
