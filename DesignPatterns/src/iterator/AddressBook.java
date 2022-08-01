/**
 * An address book that stores a list of contacts.
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * @author Jalal Choker, jalal.choker@gmail.com
 * @date 27-07-2022
 */
public class AddressBook implements Iterable<Contact> {
	
	// the contacts collection that client code will have to iterate over
	private final List<Contact> contacts;
	
	public AddressBook()
	{
		this.contacts = new ArrayList<>();
	}
	
	public void addContact(String firstName, String lastName, String email, String phone, String address)
	{
		this.contacts.add(new Contact(firstName, lastName, email, phone, address));
	}

	public int size() {
		return contacts.size();
	}	
	
	@Override
	public String toString() {
		return contacts.stream().map(Object::toString)
                .collect(Collectors.joining("\r\n"));
	}
	
	@Override
	public Iterator<Contact> iterator() {
		return new AddressBookIterator();
	}
	
	/**
	 * An Iterator for Contacts contained within AddressBook class.
	 */
	private class AddressBookIterator implements Iterator<Contact>
	{
		private int current = 0;
		
		@Override
		public boolean hasNext() {
			return current < contacts.size();
		}

		@Override
		public Contact next() {
			Contact res;
			try {
				res = contacts.get(current);
			} catch (IndexOutOfBoundsException e) {
				throw new NoSuchElementException();
			}

			current++; // safely increment pointer
			return res;
		}
		
		@Override
		public void remove()
		{
			if(current <= 0 || current > contacts.size())
		        throw new UnsupportedOperationException("remove");
			
			contacts.remove(current - 1);
		}
	}
}


