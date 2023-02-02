import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Movie movie = new Movie();
		System.out.print("Input movie id   : ");
		String movieId = scan.nextLine();
		System.out.print("Input movie name : ");
		String movieName = scan.nextLine();
		
		System.out.println();
		System.out.print("Input director name   : ");
		String dName = scan.nextLine();
		System.out.print("Input director e=mail : ");
		String dEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char dGender = scan.nextLine().toLowerCase().charAt(0);
		while(!(dGender == 'f' || dGender == 'm')) {
			System.out.print("Input director gender, agian : ");
			dGender = scan.nextLine().toLowerCase().charAt(0);
		}
		
		System.out.println();
		System.out.print("Input movie theater no. : ");
		int theaterNo = scan.nextInt();
		while(theaterNo <= 0 || theaterNo > 15) {
			System.out.print("Plese input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}
		
		Theater theater = new Theater(movieId, movieName, new Director(dName, dEmail, dGender), theaterNo);
		System.out.println();
		System.out.println(theater);
	}

}
