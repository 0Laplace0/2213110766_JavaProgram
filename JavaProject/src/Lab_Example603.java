import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[5];
		for(int i = 1; i <= num.length; i++) {
				do{
					System.out.print("Input number " + i + " : ");
					num[i] = scan.nextInt();
				}while(num[i] < 0);
				
		}
		System.out.println();
		System.out.println("Summation of positive number is " + sumOfPos(num));
	}

	public static int sumOfPos(int[] number) {
		int sum = 0;
		for(int _number : number) {
				sum += _number;
		}
		return sum;

	}
}
