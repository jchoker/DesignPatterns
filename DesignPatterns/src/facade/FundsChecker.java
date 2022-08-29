package facade;

import java.util.*;
/**
 * Pattern: Facade
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 13
 */
public class FundsChecker {
    
	private final Map<String,Double> fundsDB; // an account balance lookup
    
    public FundsChecker()
    {
        fundsDB = new HashMap<>();
        createSampleFunds();
    }
    
    private void createSampleFunds()
    {
        fundsDB.put("12345", 1000d);
        fundsDB.put("54321", 2000d); 
        fundsDB.put("67890", 3000d );
    }
    
    public boolean withdraw(String act,double amountToWithdraw)
    {
        var funds = fundsDB.get(act);
        if(amountToWithdraw > funds)
        {
           System.out.println("Not enough money in account");
           System.out.println("Current balance is " + funds);
           return false; 
        }
        
        decreaseFunds(act, amountToWithdraw);
        System.out.println("Withdrawal complete.");
        System.out.println("Current balance is " + fundsDB.get(act));
        return true;
    }
    
    public void deposit(String act, double amountToDeposit)
    {
        increaseFunds(act, amountToDeposit);
        System.out.println("Deposit complete.");
        System.out.println("Current balance is " + fundsDB.get(act));
    }
    
    private void decreaseFunds(String act, double withdrawalAmount)
    {
        fundsDB.put(act, fundsDB.get(act) - withdrawalAmount);
    }
    
    private void increaseFunds(String act, double depositAmount)
    {
        fundsDB.put(act, fundsDB.get(act) + depositAmount);
    }
}