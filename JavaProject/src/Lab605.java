import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		int[] number = new int[5];
		for(int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i+1) + " :"));
		}
		showEven(number);
		showOdd(number);

	}//end of main()
	
	public static void showEven(int[] nums) {
		String showMessage = "";
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
				showMessage += nums[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number :\n" + showMessage);
	}//end of showEven()
	
	public static void showOdd(int[] nums) {
		String showMessage = "";
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]%2==1) {
				showMessage += nums[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number :\n" + showMessage);
	}//end of showOdd()

}
