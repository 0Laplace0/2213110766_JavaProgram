import java.util.*;
import java.text.DecimalFormat;

public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Product Name    : ");
		String productName = scan.nextLine();
		System.out.print("Input Product Unit    : ");
		int productUnit = scan.nextInt();
		System.out.print("Input Price per unit  : ");
		float pricePerUnit = scan.nextFloat();
		System.out.println("-----------------------------------------------");
		float totalPrice = pricePerUnit*productUnit;
		System.out.println("Total Price is " + frm.format(totalPrice) + " baht.");
		System.out.println("-----------------------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = scan.nextInt();
		System.out.println("-----------------------------------------------");
		float totalDiscount = totalPrice * discount /100;
		System.out.println("Discount from " + discount + "%\t" + frm.format(totalDiscount) + " baht.");
		float amount = totalPrice-totalDiscount;
		System.out.println("Amount to be paid\t" + frm.format(amount) + " baht.");

	}

}
