
public class Book {
	
	private String author, title; 
	private double price; 
	private int pages; 
	private static double discount = 0.20; 
	
	public Book(String author, String title, double price, int pages) {
		this.author = author; 
		this.title = title; 
		this.price = price; 
		this.pages = pages; 
	}
	
	public String getAuthor() {
		return author; 
	}
	
	public String getTitle() {
		return title; 
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getPages() {
		return pages; 
	}
	
	public void setPrice(double price) {
		this.price = price; 
	}
	
	
	public String toString() {
		return "Your book has the title " + title + ", author:" + author + "pages: " + pages + "price" + (price - (price*discount)); 
	}

}
