package BookApplication;

public class Book {
	private String title,author,description;
	private double price;
	private int copies;
	
	public Book() {
		title = "Harry Potter";
		author = "JK Rowling";
		description = "Magic, Fantacy and Suspence thriller";
		price = 100;
		copies = 10;
				
	}
	
	public Book(String title, String author, String description, int price, int  copies) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.price = price;
		this.copies = copies;
				
	}
	
	public void getDisplayText () {
		System.out.println("Title: '" + title + "' Author: '" + author + "'\n"
				+ " Description: '" + description + "' Price: '" + price + "' Copies In Stock " + copies);
	}
	
	public double getCopyPrice(int numberRequested) {
		if (numberRequested <= copies) {
			return (numberRequested * price);
		} else 
			return -1;
	}
	
	public boolean getIsInStock() {
		if (copies == 0) return false;
		return true;
	}
	
	
	//setters and getters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	
	

}
