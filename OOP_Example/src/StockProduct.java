import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		Product[] pd = new Product[4];
		
		for(int i = 0; i < pd.length; i++) {
			pd[i] = new Product();
			System.out.print("Input product Id    : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			pd[i].setUnit(scan.nextInt());
			System.out.print("Input product Price : ");
			pd[i].setPrice(scan.nextDouble());
			while(!(pd[i].getPrice() > 0)) {
				System.out.print("Input product Price : ");
				pd[i].setPrice(scan.nextDouble());
			}
			System.out.println();
		}
		Line();
		double amount = 0;
		for(Product PD: pd) {
			System.out.println("Product ID : " + PD.getId() + ", Total price = " + frm.format(PD.calulate()) + " baht.");
			amount += PD.calulate();
		}
		Line();
		System.out.println("Total price of all products is " + frm.format(amount) + " baht.");

	}
	
	static void Line() {
		for(int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
