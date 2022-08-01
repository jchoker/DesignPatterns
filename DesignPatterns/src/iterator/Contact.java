/**
 * A contact in an address book, with last name, first name, email, phone, and address.
 */
package iterator;

/**
 * @author Jalal Choker
 * 27-07-2022
 */
public class Contact {

	public Contact(String firstName, String lastName, String email, String phone, String address)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;		
	}

	public final String firstName;
	public final String lastName;
	public final String email;
	public final String phone;
	public final String address;

	@Override
	public String toString()
	{
		return lastName  + ", " + firstName  + ", " + email  + ", "	+ phone  + ", " + address;
	}
}