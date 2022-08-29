package facade;

import java.util.*;
/**
 * Pattern: Facade
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 13
 */
public class SecurityCodeChecker {
    
    private final Map<String,String> securityDB; // an account to code lookup
    
    public SecurityCodeChecker()
    {
        securityDB = new HashMap<>();
        createSampleSecurityCodes();
    }
    
    private void createSampleSecurityCodes()
    {
        securityDB.put("12345", "1@");
        securityDB.put("54321", "2#"); 
        securityDB.put("67890", "3$");
    }
    
    public boolean isCodeCorrect(String act, String code)
    {
        return securityDB.containsKey(act) && code.equals(securityDB.get(act));
    }
}