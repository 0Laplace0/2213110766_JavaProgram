
public class Video {
	private String title;
	private boolean checkedOut = false;
	private double averageRating;
	private int ratingSum = 0;
	private int ratingCount =- 0;
	
	public void setTitle(String iTitle) {
		title = iTitle;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void addRating(int rate) {
		ratingSum += rate;
		ratingCount += 1;
		averageRating = ratingSum / ratingCount;
	}
	
	public double getAverageRating() {
		return averageRating;
	}
	
	public void checkedOut() {
		checkedOut = true;
	}
	
	public void returnToStore() {
		checkedOut = false;
	}
	
	public Boolean isCheckedOut() {
		return checkedOut;
	}
}
