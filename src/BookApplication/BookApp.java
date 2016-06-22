package BookApplication;

public class BookApp {
	public static void main(String[] args) {
		Book book = new Book();
		book.getDisplayText();
		Book bookAp = new Book("Julius Ceaser", "Shakespear", "Drama and History", 300, 6/*, "Jul109"*/);
		System.out.println(bookAp.getDisplayText());
		System.out.println();
		System.out.println("Price of 5 books: " + book.getCopyPrice(5));
		
		BookDatabase dataBase = new BookDatabase();
		dataBase.createBookDatabase();
		System.out.println();
		System.out.println("---------database Search---------");
		System.out.println(dataBase.getBook("Java1001").getDisplayText());
	}

}
