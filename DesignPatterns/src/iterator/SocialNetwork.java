/**
 * A social network that stores a list of profiles.
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
public class SocialNetwork implements Iterable<Profile> {
	
	// the profiles collection that client code needs to iterate over
	private final List<Profile> profiles;
	
	public SocialNetwork()
	{
		this.profiles = new ArrayList<>();
	}
	
	public void addProfile(String firstName, String lastName, String email, String password, String dob)
	{
		this.profiles.add(new Profile(firstName, lastName, email, password, dob));
	}

	public int size() {
		return profiles.size();
	}	
	
	@Override
	public String toString() {
		return profiles.stream().map(Object::toString)
                .collect(Collectors.joining("\r\n"));
	}
	
	@Override
	public Iterator<Profile> iterator() {
		return new SocialNetworkIterator();
	}
	
	/**
	 * An Iterator for profiles contained within SocialNetwork class.
	 */
	private class SocialNetworkIterator implements Iterator<Profile>
	{
		private int current = 0;
		
		@Override
		public boolean hasNext() {
			return current < profiles.size();
		}

		@Override
		public Profile next() {
			Profile res;
			try {
				res = profiles.get(current);
			} catch (IndexOutOfBoundsException e) {
				throw new NoSuchElementException();
			}

			current++; // safely increment pointer
			return res;
		}
		
		@Override
		public void remove()
		{
			if(current <= 0 || current > profiles.size())
		        throw new UnsupportedOperationException("remove");
			
			profiles.remove(current - 1);
		}
	}
}


