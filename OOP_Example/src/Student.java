
public class Student {

	// The private instance variable
	private String name;
	private String address;
	// The courses taken and grades for the courses are kept in 2 parallel arrays
	private String[] courses;
	private int[] grades; // valid range is [0, 100]
	private int numCourses; // Number of courses taken so far
	// Maximum number of courses taken by student
	private static final int MAX_COURSES = 30;

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
		numCourses = 0;

	}

	// the public getters and setters.
	// No setter for name as it is not designed to be changed
	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return getName() + " (" + getAddress() + ")";
	}

	public void addCoursesGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	public void printGrade() {
		System.out.print(name);
		for (int i = 0; i < numCourses; i++) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}

	public double getAverage() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grades[i];
		}
		return (double)sum / numCourses;
	}
}
