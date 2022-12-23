import java.util.*;

public class CheckStockProducts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int list = scan.nextInt();
		System.out.println();
		Product[] pd = new Product[list];
		for (int i = 0; i < list; i++) {
			pd[i] = new Product();
			System.out.print("Input product Id   : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			pd[i].setUnit(scan.nextInt());
			System.out.println();
		}

		String[] status = { "LOW", "NORMAL", "HIGH" };
		for (int i = 0; i < status.length; i++) {
			Line();
			System.out.println("List of product in '" + status[i] + "' status.");
			Line();
			for (Product PD : pd) {
				if(status[i].equals("LOW") && PD.checkStatus().equals("LOW"))
					System.out.println(">> " + PD.getId() + " has " + PD.getUnit() + " units");
				if(status[i].equals("NORMAL") && PD.checkStatus().equals("NORMAL"))
					System.out.println(">> " + PD.getId() + " has " + PD.getUnit() + " units");
				if(status[i].equals("HIGH") && PD.checkStatus().equals("HIGH"))
					System.out.println(">> " + PD.getId() + " has " + PD.getUnit() + " units");
			}
		} //end of for
		
		/*System.out.println("List of product in 'LOW' status.");
		for (Product PD : pd) {
			if(PD.checkStatus().equals("LOW"))
				System.out.println(">> " + PD.getId() + " has " + PD.getUnit() + " units");
		}
		System.out.println("List of product in 'NORMAL' status.");
		for (Product PD : pd) {
			if(PD.checkStatus().equals("NORMAL"))
				System.out.println(">> " + PD.getId() + " has " + PD.getUnit() + " units");
		}
		System.out.println("List of product in 'HIGH' status.");
		for (Product PD : pd) {
			if(PD.checkStatus().equals("HIGH"))
				System.out.println(">> " + PD.getId() + " has " + PD.getUnit() + " units");
		}*/
		
	} // end of main()
		



	static void Line() {
		for (int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
