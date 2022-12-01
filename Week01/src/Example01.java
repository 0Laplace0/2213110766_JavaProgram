
public class Example01 {

	public static void main(String[] args) {
		String isbn="IB2-6325-85-4-1", title = "Basic Java Programming";
		//String title = "Basic Java Programming";
		int unit = 5;
		float price = 225.75f;
		System.out.println("Bok ISBN : " + isbn);
		System.out.println("Book Title : " + title);
		System.out.println("Book Unit : " + unit);
		System.out.println("Book Price : " + price);
		float totalPrice = price*unit;
		System.out.println("-------------------------------------");
		System.out.println("Total Price is " + totalPrice);
		float pricewithVat = totalPrice+(totalPrice*7/100);
		System.out.println("Add Vat 7% is " + pricewithVat);

	}

}
