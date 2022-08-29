package facade;

/**
 * Pattern: Facade
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 13
 */
public class BankAccountFacade {

	private final Bank bank;
	private final  AccountChecker actchk;
	private final  SecurityCodeChecker codechk;
	private final  FundsChecker fndchk;

	public BankAccountFacade(Bank bank, AccountChecker actchk, SecurityCodeChecker codechk, FundsChecker fndchk)
	{
		this.bank = bank;
		this.actchk = actchk;
		this.codechk = codechk;
		this.fndchk = fndchk;
		this.bank.welcomeMessage();
	}

	private String account;
	private String secCode;

	public void setAccount(String account) { this.account = account;}

	public void setCode(String code) { this.secCode = code;}

	public void withdrawCash(double amount)
	{
		if(actchk.exists(account) && codechk.isCodeCorrect(account, secCode) && fndchk.withdraw(account, amount))
		{
			System.out.println("Transaction completed.\n");
		}
		else {
			System.out.println("Transaction failed.\n");
		}
	}

	public void depositCash(double amount)
	{
		if(actchk.exists(account) && codechk.isCodeCorrect(account, secCode))
		{
			fndchk.deposit(account, amount);
			System.out.println("Transaction completed.\n");
		}
		else {
			System.out.println("Transaction failed.\n");
		}
	}
}