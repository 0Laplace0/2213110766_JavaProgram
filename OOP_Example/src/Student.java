
public class Student {

	// attributes
	private String name;
	private int score;
	
	public void setName(String Name) {
		name = Name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setScore(int Score) {
		score = Score;
	}
	
	public int getScore() {
		return score;
	}
	
	public boolean checkScore() {
		if(score <= 100 && score >= 0)
			return true;
		else
			return false;
	}
	
	public boolean isPass() {
		if(score >= 50)
			return true;
		return false; //can use both
	}
}
