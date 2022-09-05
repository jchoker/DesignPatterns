package strategy;

import java.util.ArrayList;
import java.util.List;

import strategy.displaystrategy.Displayer;
import strategy.sortstrategy.Sorter;

/**
 * Pattern: Strategy
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 15
 */
public class Author  {

	private final String name;
	private final List<Book> books;
	private Sorter<Book> sorter;
	private Displayer<Book> displayer ;

	public Author(String name, Sorter<Book> sorter, Displayer<Book> displayer  )
	{
		this.name = name;
		this.books = new ArrayList<Book>();
		setSorter (sorter);
		setDisplayer (displayer);
	}

	public String getName() {
		return name;
	}

	public void setSorter(Sorter sorter){
		this.sorter = sorter;
	}	    

	public void setDisplayer(Displayer displayer){
		this.displayer = displayer;
	}

	public void addBook(Book book) {
		books.add(book);
	}	

	public void sortBooks() {
		sorter.sort(books);
	}

	public void displayBooks ()	{
		displayer.display(books);
	}

	@Override
	public String toString() {

		return name + ": " + books.toString();
	}
}
