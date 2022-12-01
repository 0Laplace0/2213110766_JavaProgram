import javax.swing.*;
import java.text.*;

public class Example02 {

	static final float BUFFETPRICE = 299;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = 5;
		float totalPrice = BUFFETPRICE*numberofCustomer;
		System.out.println("Buffet of " + numberofCustomer + " Customers is " + frm.format(totalPrice));
		float serviceCharge = totalPrice+(totalPrice*3/100);
		System.out.println("Add Service Charge 3% is " + frm.format(serviceCharge));
		JOptionPane.showMessageDialog(null, "Buffet of " + numberofCustomer + " Customers is " + frm.format(totalPrice) +
				"\nAdd Service Charge 3% is " + frm.format(serviceCharge));

	}

}
