package test;

import java.util.Map;

import org.junit.jupiter.api.Test;

import strategy.Author;
import strategy.Book;
import strategy.displaystrategy.Displayer;
import strategy.displaystrategy.NaturalOrderDisplayer;
import strategy.displaystrategy.ReverseOrderDisplayer;
import strategy.sortstrategy.InsertionSorter;
import strategy.sortstrategy.SelectionSorter;
import strategy.sortstrategy.Sorter;

class StrategyTest {
	/**
	 * Design Pattern: Strategy
	 * 
	 * @author Jalal Choker
	 * @since 2022 - 08 - 15
	 */
	@Test
	void testStrategy()
	{		
		Sorter<Book> sorter1, sorter2;
		Displayer<Book> displayer1, displayer2;

		sorter1 = new InsertionSorter();
		sorter2 = new SelectionSorter();

		displayer1 = new NaturalOrderDisplayer();
		displayer2 = new ReverseOrderDisplayer ();		

		var author1 = new Author("J.K. Rowling",sorter1,displayer1);		
		var author2 = new Author("Stephen King", sorter2, displayer2);


		Map <String, String> bookInfo1, bookInfo2;

		bookInfo1 = Map.of(				
				"Harry Potter", "1770893083",
				"Quidditch Through The Ages", "0385659768",
				"The Shining", "1443433659"
				);		

		bookInfo2 = Map.of(				
				"Fantastic Beasts", "1770891048",
				"Carrie", "0006485456"
				);

		addBooks(author1,bookInfo1);
		addBooks(author2,bookInfo2);

		author1.sortBooks();
		// println & displayBooks will both show books in the same order (ascending)
		System.out.println(author1.toString());
		author1.displayBooks();

		/*
		 * Change sorter & displayer of author 1.
		 */
		author1.setSorter(sorter2);
		author1.setDisplayer(displayer2);

		author1.sortBooks();
		System.out.println();
		// println & displayBooks will show books in different orders (ascending/descending)
		System.out.println(author1.toString()); 
		author1.displayBooks();		

		author2.sortBooks();
		System.out.println();
		System.out.println(author2.toString());
		author2.displayBooks();
	}

	private static void addBooks (Author author, Map<String, String> bookInfo)
	{
		for (String name : bookInfo.keySet())
			author.addBook(new Book(name, bookInfo.get(name)));
	}
}
