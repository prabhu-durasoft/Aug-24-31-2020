
public class BookUser {

	public static void main(String[] args) {
		//Book b1 = new Book();
		Book b1 = new Book("Why we Sleep?", 12.34);
		b1.author = new Author("Mike");
		//b1.title = "Why we sleep?";
		//b1.price = 12.34;
		b1.buy("Amazon");
		
		//Book b2 = new Book();
		Book b2 = new Book("Ride of lifetime", 10.34);
		b2.buy("Flipkart");
		
	}

}
