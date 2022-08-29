package facade;

import java.util.*;
/**
 * Pattern: Facade
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 13
 */
public class AccountChecker {

	private final Set<String> accountDB;
	public AccountChecker()
	{
		accountDB = new HashSet<>();
		createSampleAccounts();
	}

	private void createSampleAccounts()
	{
		accountDB.add("12345"); accountDB.add("54321");  accountDB.add("67890");
	}

	public boolean exists(String act)
	{
		return accountDB.contains(act);
	}
}