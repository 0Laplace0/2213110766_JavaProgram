import java.util.Scanner
;
public class BookDemo01 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input author name   : ");
		String name = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String email = scan.next();
		Author01 author = new Author01(name, email);
		
		System.out.println();
		System.out.print("Input book title : ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("Input book page  : ");
		int page = scan.nextInt();
		Book01 book = new Book01(title, author, page);
		System.out.println(book);

	}

}
