import java.time.Year;

public class Book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPublishyear(int year) {
		publishyear  = year;
	}
	
	public int getPublishyear() {
		return publishyear;
	}
	
	public int getTotalyear() {
		return Year.now().getValue() - publishyear;
	}
	
	public String toString() {
		return String.format("Title: %s published for %d year (%.2f baht). ", this.title, getTotalyear(), this.getPrice());
	}
}
