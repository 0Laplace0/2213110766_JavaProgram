
public class Theater extends Movie{

	private int theaterNo;
	
	public Theater() {
		super();
		theaterNo = 0;
	}
	
	public Theater(String id, String name, Director director, int theaterNo) {
		super(id, name, director);
		this.theaterNo = theaterNo;
	}
	
	public String getTheaterName() {
		String theaterName;
		if(theaterNo >= 1 && theaterNo <= 11) {
			theaterName = "Basic Theater";
		}else if(theaterNo >= 12 && theaterNo <= 14) {
			theaterName = "Sweet Theater";
		}else if(theaterNo == 15) {
			theaterName = "Premium Theater";
		}else {
			theaterName = null;
		}
		
		return theaterName;
	}
	
	@Override
	public String toString() {
		return getTheaterName() + ": " + super.toString();
	}
	
}
