import javax.swing.*;

public class Lab104 {

	static int hourPrice = 50;
	static float minutePrice = 25/100f;
	public static void main(String[] args) {
		int timeParking = Integer.parseInt(JOptionPane.showInputDialog("Input Time Parking (minute):"));
		int hour = timeParking / 60; 
		int minute = timeParking % 60;
		int totalHourPrice = hourPrice * hour;
		float totalMinutePrice = minutePrice * minute;
		float amount = totalHourPrice + totalMinutePrice;
		JOptionPane.showMessageDialog(null, "You Parking " + hour + " Hour " + minute + " Minute." +
				"\nAmount to be paid is " + amount + " baht.");

	}

}
