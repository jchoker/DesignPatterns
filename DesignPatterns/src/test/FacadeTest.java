package test;

import org.junit.jupiter.api.Test;

import facade.*;
/**
 * Pattern: Facade
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 13
 */
class FacadeTest {

	@Test
	void testFacade()
	{
		// create a new bank facade
		var bankGateway = new BankAccountFacade(new Bank("XYZ"),new AccountChecker(),new SecurityCodeChecker(),new FundsChecker());

		bankGateway.setAccount("12345");
		bankGateway.setCode("1@");
		
		bankGateway.withdrawCash(500);
		bankGateway.withdrawCash(750);

		bankGateway.depositCash(250);
	}
}
