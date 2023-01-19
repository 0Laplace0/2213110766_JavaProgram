import java.util.Scanner;

public class AuthorDemo2 {

	public static void main(String[] args) {
		Author[] author = new Author[4];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < author.length; i++) {
			System.out.println("Information Author " + (i+1));
			Line();
			System.out.print("Input author name   : ");
			String name = scan.nextLine();
			System.out.print("Input author e-mail : ");
			String email = scan.nextLine();
			Line();
			author[i] = new Author(name, email);
		}
		
		System.out.println();
		for(int i = 0; i < author.length; i++) {
			System.out.println((i+1) + ". " + author[i].getName() +" (" + author[i].getEmail() + ")");
		}

	}

	public static void Line() {
		for(int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
