import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] radius = new double[5];
		double[] height = new double[5];
		Cylinder[] cylinder = new Cylinder[5];
		
		for(int i = 0; i < cylinder.length; i++) {
			System.out.print("Input Radius " + (i+1) + " : ");
			radius[i] = scan.nextDouble();
			System.out.print("Input Height " + (i+1) + " : ");
			height[i] = scan.nextDouble();
			System.out.println();
			cylinder[i] = new Cylinder(radius[i], height[i]);
		}
		
		for(int i = 0; i < cylinder.length; i++) {
			System.out.println("Cylinder " + (i+1) + ", [volume = " + cylinder[i].getVolume() + "]");
		}
	}

}
