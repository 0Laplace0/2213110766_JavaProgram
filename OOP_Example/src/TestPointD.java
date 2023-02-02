
public class TestPointD {

	public void Main(String[] args) {
		
		Point2D p1 = new Point2D();
		System.out.println("Default x, y of Point2D = " + p1);
		p1.setXY(10, 11);
		System.out.println("x, y of Point2D = " + p1);
		//return value of x and y from getXY()
		System.out.println("x of Point2D is : " + p1.getXY()[0]);
		System.out.println("Y of Point2D is : " + p1.getXY()[1]);
		
		Point3D p2 = new Point3D();
		System.out.println("Default x, y, and z of Point3D = " + p2);
		p2.setXYZ(10, 12, 7);
		System.out.println("x of Point3D is : " + p2.getXY()[0]);
		System.out.println("Y of Point3D is : " + p2.getXY()[1]);
		System.out.println("Z of Point3D is : " + p2.getXY()[2]);
	}
	
}
