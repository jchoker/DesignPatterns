package facade;

/**
 * Pattern: Facade
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 13
 */
public class Bank{

	private final String bankName;

	public Bank(String bankName)
	{
		this.bankName = bankName;
	}

	public void welcomeMessage()
	{
		System.out.println("Welcome to " + bankName + " bank");
		System.out.println("We hope you will be satisfied with our service");
	}    
}