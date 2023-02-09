import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {

		double[] radius = new double[5];
		double[] height = new double[5];
		Cylinder[] cylinder = new Cylinder[5];
		
		for(int i = 0; i < cylinder.length; i++) {
			radius[i] = Double.parseDouble(JOptionPane.showInputDialog("Input Radius " + (i+1)));
			height[i] = Double.parseDouble(JOptionPane.showInputDialog("Input Height " + (i+1)));
			
			cylinder[i] = new Cylinder(radius[i], height[i]);
		}
		
			JOptionPane.showMessageDialog(null, "Cylinder 1, [volume = " + cylinder[0].getVolume() + "]"
					+ "\nCylinder 2, [volume = " + cylinder[1].getVolume() + "]"
					+ "\nCylinder 3, [volume = " + cylinder[2].getVolume() + "]"
					+ "\nCylinder 4, [volume = " + cylinder[3].getVolume() + "]"
					+ "\nCylinder 5, [volume = " + cylinder[4].getVolume() + "]");

	}

}
