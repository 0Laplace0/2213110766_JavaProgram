import javax.swing.*;

public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		int indexOfArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array :"));
		while(checkIndex(indexOfArray, nums)) {
			indexOfArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, agian :"));
		}
		
		JOptionPane.showMessageDialog(null, "Current data, num[" + indexOfArray + "] is " + currentData(indexOfArray, nums) 
				+ "\n" + (((indexOfArray-1) > 0 )? "Previous data, nums[" + (indexOfArray-1) + "] is " + prevData(indexOfArray, nums):"No previous data")
				+ "\n" + (((indexOfArray+1) < nums.length)?"Next data, nums[" + (indexOfArray+1) + "] is " + nextData(indexOfArray, nums):"No next data"));

	}//end of main()
	
	public static boolean checkIndex(int index, int[] nums) {
		return (index < 0 || index > (nums.length - 1))? true: false;
	}//end of checkIndex()
	
	public static int currentData(int index, int[] nums) {
		int crtData = nums[index];
		return crtData;
	}//end of currentData()
	
	public static int prevData(int index, int[] nums) {
		int prvData = nums[index-1];
		return prvData;
	}//end of prevData()
	
	public static int nextData(int index, int[] nums) {
		int nxtData = nums[index+1];
		return nxtData;
	}//end of nextData()
}
