
public class Drink {

	private int type;
	private char size;
	
	public Drink() {
		this.type = 0;
		this.size = ' ';
	}
	
	public Drink(int type, char size) {
		this.type = type;
		this.size = size;
	}
	
	public String getTypeName() {
		if(type == 1) {
			return "Hot";
		}else if(type == 2) {
			return "Cold";
		}else {
			return null;
		}
	}
	
	public int getTypePrice() {
		if(type == 1) {
			return 10;
		}else if(type == 2) {
			return 20;
		}else {
			return 0;
		}
	}
	
	public String getSizeName() {
		if(size == 's') {
			return "Small";
		}else if(size == 'm') {
			return "Medium";
		}else if(size == 'l') {
			return "Large";
		}else {
			return null;
		}
	}
	
	public int getSizePrice() {
		if(size == 's') {
			return 15;
		}else if(size == 'm') {
			return 20;
		}else if(size == 'l') {
			return 25;
		}else {
			return 0;
		}
	}
	
	public int getTotalPrice() {
		return getTypePrice() + getSizePrice();
	}
}
