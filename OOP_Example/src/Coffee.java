
public class Coffee extends Drink{

	private int typeCoffee;
	private char sizeCoffee;
	private Barlista barlista;
	
	public Coffee(int type, char sizeCoffee, int typeCoffee, Barlista barlista) {
		super();
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee  = typeCoffee;
		this.barlista = barlista;
	}
	
	public Coffee(int type, int typeCoffee) {
		super();
		this.sizeCoffee = ' ';
		this.typeCoffee  = 0;
		this.barlista = null;
	}
	
	public Barlista getBarlista() {
		return barlista;
	}
	
	public String getTypeName() {
		if(typeCoffee == 1) {
			return "Americano";
		}else if(typeCoffee == 2) {
			return "Espresso";
		}else if(typeCoffee == 3) {
			return "Cappuccino";
		}else {
			return null;
		}
	}
	
	public int getTypePrice() {
		if(typeCoffee == 1) {
			return 50;
		}else if(typeCoffee == 2) {
			return 55;
		}else if(typeCoffee == 3) {
			return 65;
		}else {
			return 0;
		}
	}
	
	public String getSizeName() {
		if(sizeCoffee == 's') {
			return "Short";
		}else if(sizeCoffee == 't') {
			return "Tall";
		}else if(sizeCoffee == 'g') {
			return "Grande";
		}else if(sizeCoffee == 'v') {
			return "Venti";
		}else {
			return null;
		}
	}
	
	public int getSizePrice() {
		if(sizeCoffee == 's') {
			return 100;
		}else if(sizeCoffee == 't') {
			return 150;
		}else if(sizeCoffee == 'g') {
			return 200;
		}else if(sizeCoffee == 'v') {
			return 250;
		}else {
			return 0;
		}
	}
	
	public int getTotalPrice() {
		return super.getTotalPrice() + getTypePrice() + getSizePrice();
	}
	
	public String toString() {
		return  super.getTypeName() + getTypeName() + "(" + getSizeName() + ") is" + getTotalPrice() + " baht.";
	}
}
