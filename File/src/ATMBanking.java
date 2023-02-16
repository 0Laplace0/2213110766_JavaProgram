import java.io.*;
import java.util.Scanner;
import java.text.*;

public class ATMBanking {

	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
		 DecimalFormat frm = new DecimalFormat("0-000-000-00-0");
		 
		 System.out.print("Enter account number : ");
		 String account = console.next();
		 while(account != frm.format(account)) {
			 System.out.print("Enter account number : ");
			 account = console.next();
		 }
		 
		 System.out.print("Enter password : ");
		 String password = console.next();
		 while(password.length() != 4) {
			 System.out.print("Enter password : ");
			 password = console.next();
		 }
		 
		 System.out.print("Enter money : ");
		 int money = console.nextInt();
		 while(money > 0) {
			 System.out.print("Enter money : ");
			 money = console.nextInt();
		 }
		 
		 /*ATMChecking bank = new ATMChecking(account, password, money);
		 show();*/

	}

}
