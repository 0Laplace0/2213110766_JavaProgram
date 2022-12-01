import javax.swing.*;
import java.text.DecimalFormat;

public class Example04 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input priduct name : ");
		String productUnitstr = JOptionPane.showInputDialog("Input product uint : ");
		int productUnit = Integer.parseInt(productUnitstr);
		/*String productPrice = JOptionPane.showInputDialog("Input product per unit : ");
		float productPerUnit = Float.parseFloat(productPrice);*/
		float productPrice = Float.parseFloat(JOptionPane.showInputDialog("Input product per unit : "));
		float totalPrice = productPrice*productUnit;
		float pricewithVat = totalPrice+(totalPrice*7/100);
		JOptionPane.showMessageDialog(null, "Total price is : " + frm.format(totalPrice) + " baht." + "\nAdd VAT 7% is " + frm.format(pricewithVat) + " baht.");

	}

}
