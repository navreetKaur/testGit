package BookApplication;

public class BookApp {
	public static void main(String[] args) {
		Book book = new Book();
		book.getDisplayText();
		Book bookAp = new Book("Julius Ceaser", "Shakespear", "Drama and History", 300, 6);
		bookAp.getDisplayText();
		System.out.println();
		System.out.println("Price of 5 books: " + book.getCopyPrice(5));
	}

}
