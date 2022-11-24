import javax.swing.*;
import java.text.*;

public class IncomeTaxCalculator {
	static final double TAX_RATE_ABOVE_20K = 0.1;
	static final double TAX_RATE_ABOVE_40K = 0.2;
	static final double TAX_RATE_ABOVE_60K = 0.3;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,##0.00");
		double taxableIncome = Double.parseDouble(JOptionPane.showInputDialog("Enter the taxable income: $"));
		double taxPayable  = 0;
		if (taxableIncome <= 20000) { // [0, 20000]
			taxPayable = 0;
			} 
		else if (taxableIncome <= 40000) { // [20001, 40000]
			taxPayable = TAX_RATE_ABOVE_20K * (taxableIncome - 20000);
			} 
		else if (taxableIncome <= 60000) { // [40001, 60000]
			taxPayable = (TAX_RATE_ABOVE_40K * (taxableIncome - 40000)) + (TAX_RATE_ABOVE_20K * 20000);
			} 
		else { // [60001, ]
			taxPayable = ((taxableIncome - 60000)* TAX_RATE_ABOVE_60K) + (20000 * TAX_RATE_ABOVE_20K) + (20000 * TAX_RATE_ABOVE_40K);
			}
		JOptionPane.showMessageDialog(null, "The income tax payable is : $" + frm.format(taxPayable));
	}

}
