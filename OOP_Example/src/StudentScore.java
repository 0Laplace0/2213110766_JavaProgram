import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		Student[] std = new Student[3]; // define Array Object
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student(); // declare array object, call all of method Student()
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, agian : ");
				std[i].setScore(scan.nextInt());
			} // end of while()
			System.out.println();
		} // end of for()
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("--------------------------------------");
		/*for (int i = 0; i < std.length; i++) {
			if (std[i].isPass()) {
				System.out.println(">> " + std[i].getName() + " ( " + std[i].getScore() + " )");
			}
		}*/
		/*for(Student STD: std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " ( " + STD.getScore() + " )");
			}
		}*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int size = scan.nextInt();
		System.out.println();
		Student[] std = new Student[size];
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			score[i] = scan.nextInt();
			while (!std[i].checkScore()) {
				System.out.print("Input student score, agian : ");
				std[i].setScore(scan.nextInt());
			} // end of while()
			Line();
		}
		for(Student STD: std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " ( " + findGrade(STD.getScore()) + " )");
			}
		}
		
	} // end of main()
	
	static void Line() {
		for(int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	static String findGrade(int score) {
			if(score >= 80 && score <= 100)
				return "A";
			else if(score >= 75 && score <= 79)
				return "B+";
			else if(score >= 70 && score <= 74)
				return "B";
			else if(score >= 65 && score <= 69)
				return "C+";
			else if(score >= 60 && score <= 64)
				return "C";
			else if(score >= 55 && score <= 59)
				return "D+";
			else if(score >= 50 && score <= 54)
				return "D";
			else
				return "F";
	}

}
