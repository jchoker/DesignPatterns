/**
 * A profile in a social network, with last name, first name, email, password and date of birth.
 */
package iterator;

/**
 * @author Jalal Choker
 * 27-07-2022
 */
public class Profile {

	public Profile(String firstName, String lastName, String email, String password, String dob)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;		
	}

	public final String firstName;
	public final String lastName;
	public final String email;
	public final String password;
	public final String dob;

	@Override
	public String toString()
	{
		return lastName  + ", " + firstName  + ", " + email  + ", "	+ password  + ", " + dob;
	}
}