
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Akira Yamato", "Tokyo");
		System.out.println(student); //toString;

		//Test Setters and Getters
		student.setAddress("Osaka");
		System.out.println(student);
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		
		//Test addCourseGrade(), printGrade(), and getAverage()
		student.addCoursesGrade("INT107", 25);
		student.addCoursesGrade("INT108", 79);
		student.addCoursesGrade("MSC202", 69);
		student.printGrade();
		
		System.out.printf("The average grade is %.2f%n", student.getAverage());
	}

}
