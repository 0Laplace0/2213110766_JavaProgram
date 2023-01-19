
public class WeeklyWeatherDataLauncher {
	public static void main(String[] args) {
		double[] rain = { 5.34, 2.34, 0.0, 0.0, 3.23, 0.0, 2.42 };
		double[] pressure = { 99.3, 95.34, 101.3, 98.42, 103.4, 100.0, 102.87 };
		WeeklyWeatherData wd = new WeeklyWeatherData();
		wd.setData(rain, pressure);
		wd.calculateStats();
		// should be 5.35
		System.out.println("Maximum Rainfall: " + wd.getMaxRain());
		// should be ~ 1.904
		//System.out.println("Average Rainfall: " + wd.getAvgRain());
		System.out.printf("Average Rainfall: %.3f", wd.getAvgRain());
	}
}
