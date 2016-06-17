package BookApplication;

public class Book {
	private String title,author,description;
	private double price;
	private boolean isInStock;
	
	public Book() {
		title = "Harry Potter";
		author = "JK Rowling";
		description = "Magic, Fantacy and Suspence thriller";
		price = 100;
		isInStock = true;
				
	}
	
	public Book(String title, String author, String description, int price, boolean isInStock) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.price = price;
		this.isInStock = isInStock;
				
	}
	
	public void getDisplayText () {
		System.out.println("Title: '" + title + "' Author: '" + author + "'\n"
				+ " Description: '" + description + "' Price: '" + price + "' In Stock? " + isInStock);
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
	public boolean getIsInStock() {
		return isInStock;
	}
	public void setIsInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}
	
	
	

}
