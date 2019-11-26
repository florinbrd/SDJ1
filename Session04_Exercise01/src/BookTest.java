import java.util.*;


public class BookTest {
	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Title: ");
		String title = inputScanner.nextLine(); 
		
		System.out.println("Author: ");
		String author = inputScanner.nextLine();
		
		System.out.println("Price: ");
		double price = inputScanner.nextDouble(); 
		
		System.out.println("Pages: ");
		int pages = inputScanner.nextInt(); 
		
		Book book1 = new Book(author, title, price, pages);
		
		System.out.println(book1.toString());
				
	}

}
