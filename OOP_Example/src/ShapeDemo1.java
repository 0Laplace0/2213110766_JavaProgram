import java.util.Scanner;

public class ShapeDemo1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input Height : ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius, null);
		System.out.println("Cricle[" + circle.toString() + "]");
		System.out.println("Cricle[area = " + circle.getArea() + "]");
		System.out.println();
		
		Cylinder cylinder = new Cylinder(radius, height);
		System.out.println("Cylinder[" + cylinder.toString() + "]");
		System.out.println("Cylinder[area = " + cylinder.getArea() + "]");
		System.out.println("Cylinder[volume = " + cylinder.getVolume() + "]");
	}

}
