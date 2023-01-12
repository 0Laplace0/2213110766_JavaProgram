import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConversion extends JFrame{
	//Components
	private JLabel lblCelsius;
	private JLabel lblFahrenheit;
	
	private JTextField tfCelsius;
	private JTextField tfFahrenheit;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0/9.0;
	private static final double CTOF = 9.0/5.0;
	private static final int OFFSET = 32;
	
	
	public TempConversion() {
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4));
		
		lblCelsius = new JLabel("Temp in Celsius:", SwingConstants.RIGHT);
		lblFahrenheit = new JLabel("Temp in Fahrenheit:", SwingConstants.RIGHT);
		
		tfCelsius = new JTextField(10);
		tfFahrenheit = new JTextField(10);
		
		c.add(lblCelsius);
		c.add(tfCelsius);
		c.add(lblFahrenheit);
		c.add(tfFahrenheit);
		
		CelsHandler celsHandler = new CelsHandler();
		tfCelsius.addActionListener(celsHandler);
		
		FahHandler fahrenheitHandler = new FahHandler();
		tfFahrenheit.addActionListener(fahrenheitHandler);
		
		setTitle("Temperature Conversion");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private class CelsHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit;
			celsius = Double.parseDouble(tfCelsius.getText());
			fahrenheit = celsius * CTOF + OFFSET;
			tfFahrenheit.setText(String.format("%.2f", fahrenheit));
		}
	}
	
	private class FahHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit;
			fahrenheit = Double.parseDouble(tfFahrenheit.getText());
			celsius = (fahrenheit - OFFSET) * FTOC;
			tfCelsius.setText(String.format("%.2f", celsius));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TempConversion tempConv = new TempConversion();
	}

}
