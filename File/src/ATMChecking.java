import java.text.*;
import java.io.*;

public class ATMChecking extends ATMData {

	private int money;

	public ATMChecking(String accNum, String pass, int money) {
		super(accNum, pass);
		this.money = money;
	}

	public boolean checkBookBank() throws IOException {
		boolean check = false;
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank"));
		String temp = "";
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			money = Integer.parseInt(data[2]);
			/*while(super.getID() != data[0]) {
				 return true;
				 
			 }*/
		}
		return check;
	}

	public void show() throws IOException {
		DecimalFormat frm = new DecimalFormat("#,###,###.00");
		if (checkBookBank() == true) {
			int money1000 = money / 1000;
			System.out.println("1000 = " + money1000);
			int money500 = (money % money1000) / 5;
			System.out.println("500 = " + money500);
			int money100 = (money % money1000) % 5;
			System.out.println("100 = " + money100);
			if(money > 0) {
				System.out.println("Your balance is " + frm.format(money) + " Baht.");
			}else {
				System.err.println("\nSorry, your id or password is wrong, or your amount not enough.");
			}
			
		}
	}
}
