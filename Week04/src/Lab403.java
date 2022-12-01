import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		int a = 0;
		String check = message.toLowerCase();
		if (check.indexOf("nichi")>=0){
			a++;
		}
		System.out.println(a==0?message:"Nichi is a sentence");
	}

}
