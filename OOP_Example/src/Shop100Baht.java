import javax.swing.*;

public class Shop100Baht {

	public void Main(String[] args) {
		Product1 pd = new Product1();
		
		pd.setUnit(10);
		
		int check = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?");
		if(check == 0) {
			pd = new PattanakarnBranch();
		}
		
		pd.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));	
		JOptionPane.showMessageDialog(null, pd);
		
	}
	
}
