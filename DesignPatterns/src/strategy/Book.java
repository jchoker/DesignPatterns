package strategy;
/**
 * Pattern: Strategy
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 15
 */
public class Book implements Comparable<Book> {

	private String title; // this Book's title
	private String isbn;  // this Book's ISBN number

	public Book(String title, String isbn)
	{
		this.title = title;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getISBN() {
		return isbn;
	}

	@Override
	public int compareTo(Book other) {
		return this.isbn.compareTo(other.isbn); // compare books by their ISBN
	}

	@Override
	public String toString() {
		return title + ": " + isbn;
	}
}
