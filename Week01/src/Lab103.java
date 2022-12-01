import javax.swing.*;

public class Lab103 {

	static final int smallDishPrice = 30;
	static final int bigDishPrice = 60;
	public static void main(String[] args) {
		int smallDish = Integer.parseInt(JOptionPane.showInputDialog("How many small dish:"));
		int bigDish = Integer.parseInt(JOptionPane.showInputDialog("How many big dish:"));
		int totalSmallDishPrice = smallDishPrice*smallDish;
		int totalBigDishPrice = bigDishPrice*bigDish;
		int totalPrice = totalSmallDishPrice + totalBigDishPrice;
		JOptionPane.showMessageDialog(null, "You order " + smallDish + " small dish" + "(" + totalSmallDishPrice + ")" + 
				"\nYou order " + bigDish + " big dish" + "(" + totalBigDishPrice + ")" + "\n\nAmount to be paid is " + totalPrice + " baht.",
				 "Noodles", JOptionPane.WARNING_MESSAGE);

	}

}
