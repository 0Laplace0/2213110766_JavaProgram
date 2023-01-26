import javax.swing.JOptionPane;

public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String title = JOptionPane.showInputDialog("Input author title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int confirm = JOptionPane.showConfirmDialog(null, "is the page correct?",
				"Confirm", JOptionPane.YES_NO_OPTION);
		Book01 book = new Book01(title, new Author01(name, email), page);
		if(confirm == 1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page, agian:"));
			book.setPage(page);
		}
		
		JOptionPane.showMessageDialog(null, "Book Title : " + book.getTitle() + 
				"\nAuthor name : " + book.getAuthor().getName() + " (" + book.getPage() + " page)" +
				"\nAuthor e-mail : " + book.getAuthor().getEmail());

	}

}
