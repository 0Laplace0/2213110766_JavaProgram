import java.text.DecimalFormat;
import java.util.*;

public class Example03 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input product name : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = scan.nextInt();
		System.out.print("Input price per unit : ");
		float pricePerUnit = scan.nextFloat();
		float totalPrice = pricePerUnit*productUnit;
		System.out.println();
		System.out.println("Total price is " + frm.format(totalPrice) + " baht.");
		float serviceCharge = totalPrice+(totalPrice*7/100);
		System.out.println("Add VAT 7% is " + frm.format(serviceCharge) + " baht.");
		

	}

}
