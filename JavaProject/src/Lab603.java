import java.util.*;

public class Lab603 {

	static Scanner scan = new Scanner(System.in);
	static int[] numberofInteger = {78, 36, 58, 41, 25, 92, 75};
	public static void main(String[] args) {
		System.out.print("Input index of array : ");
		int indexOfArray = scan.nextInt();
		while(indexOfArray < 0 || indexOfArray > (numberofInteger.length - 1) ) {
			System.out.print("Input index of array, agian : ");
			indexOfArray = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is " + numberofInteger[indexOfArray]);
		//System.out.println("Value in next    index is " + numberofInteger[indexOfArray + 1]);
		if(indexOfArray == numberofInteger.length - 1) {
			System.out.println("Sorry, " + indexOfArray + " is the last index in array.");
		}else {
			System.out.println("Value in next    index is " + numberofInteger[indexOfArray + 1]);
		}
	}

}
