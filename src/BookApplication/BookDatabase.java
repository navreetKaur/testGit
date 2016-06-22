package BookApplication;

import java.util.HashMap;
import java.util.Map;

public class BookDatabase {
	
	private Map<String, Book> data;
	
	public void createBookDatabase() {
		Map<String, Book> data = new HashMap<String, Book>();
		data.put("Java1001", new Book("Head First Java", "Kathy Sierra and Bert Bates",
				"Easy to read Java workbook", 47.5, 10/*, "Java1001"*/));
		data.put("Java1002", new Book("Thinking in Java", "Bruce Eckel", 
				"Details about Java under the hood", 20, 10/*, "Java1002"*/));
		data.put("Orcl1003", new Book("OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", 
				"Everything you need to know in one place", 45, 10/*, "Orcl1003"*/));
		data.put("Python1004", new Book("Automate the Boring Stuff with Python", "Al Sweigart", 
				"Fun with Python", 10.5, 10/*, "Python1004"*/));
		data.put("Zombie1005", new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk", 
				"Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.5, 10/*, "Zombie1005"*/));
		data.put("Rasp1006", new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris", 
				"A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, 10/*, "Rasp1006"*/));
		this.data = data;
		
	}
	
	
	public Book getBook(String SKU) {
		return data.get(SKU);
		
	}


	public Map<String, Book> getData() {
		return data;
	}


	public void setData(Map<String, Book> data) {
		this.data = data;
	}
	

	
	

}
