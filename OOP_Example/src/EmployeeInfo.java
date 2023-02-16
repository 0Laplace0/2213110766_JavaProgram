import java.util.Scanner;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		String choice;
		System.out.print("Insert or Read data (form file)? : ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert") && !choice.equals("read")) {
			System.out.print("Insert or Read data (form file)? : ");
			choice = console.next().toLowerCase();
		}
		
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) {
			file.insert();
		}

	}

}
