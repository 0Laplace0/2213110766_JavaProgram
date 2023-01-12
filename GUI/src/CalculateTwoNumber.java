import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber01;
	private JTextField txtNumber02;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber01 = new JLabel("Enter Number 1");
		lblNumber01.setBounds(35, 11, 86, 14);
		contentPane.add(lblNumber01);
		
		txtNumber01 = new JTextField();
		txtNumber01.setBounds(154, 8, 86, 20);
		contentPane.add(txtNumber01);
		txtNumber01.setColumns(10);
		
		JLabel lblNumber02 = new JLabel("Enter Number 2");
		lblNumber02.setBounds(35, 36, 86, 14);
		contentPane.add(lblNumber02);
		
		txtNumber02 = new JTextField();
		txtNumber02.setBounds(154, 33, 86, 20);
		contentPane.add(txtNumber02);
		txtNumber02.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(183, 186, 57, 14);
		contentPane.add(lblResult);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(35, 68, 72, 14);
		contentPane.add(lblOperator);
				
		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(154, 64, 72, 22);
		
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);
		
		JLabel lblHowToShowDigit = new JLabel("How to show digit");
		lblHowToShowDigit.setBounds(35, 98, 98, 14);
		contentPane.add(lblHowToShowDigit);
		
		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(154, 94, 72, 23);
		contentPane.add(oneDigit);
		
		final JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(154, 115, 72, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		final JLabel lblOption = new JLabel("Option to show");
		lblOption.setBounds(35, 143, 86, 14);
		contentPane.add(lblOption);
		
		final JCheckBox chkDialogBox = new JCheckBox("Show Result at DialogBox");
		chkDialogBox.setBounds(154, 141, 97, 23);
		contentPane.add(chkDialogBox);
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				String operator;
				//JButton
				if(e.getSource() == btnOK) {
					num1 = Double.parseDouble(txtNumber01.getText());
					num2 = Double.parseDouble(txtNumber02.getText());
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1 + num2;
					if(operator.equals("-"))
						sum = num1 - num2;
					if(operator.equals("*"))
						sum = num1 * num2;
					if(operator.equals("/"))
						sum = num1 / num2;
					
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(oneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(twoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					
					lblResult.setText(frmNumber.format(sum));
					
					//JCheckBox
					if(chkDialogBox.isSelected()) {
						JOptionPane.showMessageDialog(null, "Result is : " + sum);
					}
					
				}
			}
		});
		btnOK.setBounds(118, 227, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(217, 227, 89, 23);
		contentPane.add(btnExit);
		
	}
}
