public class Book {
	
	//has-a
	String title = "ABC"; //NOT CONSIDERED A GOOD CODING PRACTICE
	double price;
	Author author;
	
	Book(String theTitle, double thePrice /*String authorName*/) {
		int i;
		title = theTitle;
		price = thePrice;
//		author = new Author(authorName);
	}
	
	void buy(String store) {
		System.out.println("Buying " + title + " from " + store);
	}
}
