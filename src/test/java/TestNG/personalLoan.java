package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class personalLoan {
	
	@Parameters({"URL"})
	@Test
	public void personalLoanMobileLogin(String personalLoanName)
	{
		System.out.println("Personal Loan Mobile Login");
		System.out.println(personalLoanName);
	}
	
	@Test
	public void personalLoanwebLogin()
	{
		System.out.println("Personal Loan Web Login");
	}
	
	@Test
	public void personalLoanAPILogin()
	{
		System.out.println("Personal Loan API Login");
	}

}
