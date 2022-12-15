import javax.swing.JOptionPane;

public class Lab_Example602_1 {

	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double itemPrice = 0;
	static boolean vilidItem = false;
	static int itemOrder;
	public static void main(String[] args) {
		inputItem();

	}//end of main()
	
	public static void inputItem(){
		itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		if(checkItem(itemOrder)) {
			System.out.println("Item " + itemOrder + " is "+ itemPrice);
		} else {
			System.out.println("Invalid Item");
		}
	}//end of inputItem()
	
	public static boolean checkItem(int item) {
		for(int i = 0; i < validValues.length; i++) {
			if(item == validValues[i]) {
				vilidItem = true;
				itemPrice = price[i];
			}
		}
		return vilidItem;
	}//end of checkItem()

}
