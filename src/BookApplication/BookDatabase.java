package BookApplication;

import java.util.ArrayList;
import java.util.List;

public class BookDatabase {
	
	private List<Book> data;
	
	public void createBookDatabase() {
		List<Book> data = new ArrayList<Book>();
		data.add(new Book("Head First Java", "Kathy Sierra and Bert Bates",
				"Easy to read Java workbook", 47.5, 10, "Java1001"));
		data.add(new Book("Thinking in Java", "Bruce Eckel", 
				"Details about Java under the hood", 20, 10, "Java1002"));
		data.add(new Book("OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", 
				"Everything you need to know in one place", 45, 10, "Orcl1003"));
		data.add(new Book("Automate the Boring Stuff with Python", "Al Sweigart", 
				"Fun with Python", 10.5, 10, "Python1004"));
		data.add(new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk", 
				"Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.5, 10, "Zombie1005"));
		data.add(new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris", 
				"A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, 10, "Rasp1006"));
		setData(data);
		
	}
	
	
	public Book getBook(String SKU) {
		for (Book book: data) {
			if (book.getSKU().equals(SKU)){
				return book;
			}
		}
		return null;
		
	}
	

	public List<Book> getData() {
		return data;
	}

	public void setData(List<Book> data) {
		this.data = data;
	}
	

}
