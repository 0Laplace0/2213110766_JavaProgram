import java.util.*;
import java.text.*;

public class Lab602 {
 
	static Scanner scan = new Scanner(System.in);
	static double sum = 0;
	static double averageNumber = 0;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("0.00");
		double[] inputScore = new double[5];
		for(int i = 0; i < inputScore.length; i++) {
			System.out.print("Input score of student " + (i+1) + " : ");
			inputScore[i] = scan.nextDouble();
			sum += inputScore[i];
		}//end for
		
		System.out.println();
		averageNumber = sum/(inputScore.length);
		System.out.println("Average of " + inputScore.length + " student is " + frm.format(averageNumber));
			for(int i = 0; i < inputScore.length; i++) {
				if(inputScore[i] >= averageNumber) {
				System.out.println("> Student " + (i+1) + " (" + inputScore[i] + ")");
				}
			}//end for
	}

}