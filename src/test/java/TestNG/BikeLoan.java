package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BikeLoan {
	
	@Parameters({"URL"})
	@Test
	public void bikeLoanMobileLogin(String bikeLoanName)
	{
		System.out.println("Bike Loan Mobile Login");
		System.out.println(bikeLoanName);
	}
	
	@Test
	public void bikeLoanwebLogin()
	{
		System.out.println("Bike Loan Web Login");
		Assert.assertTrue(false);
	}
	
	
	@Test(dataProvider = "getData")
	public void bikeLoanAPILogin(String username, String password)
	{
		System.out.println("Bike Loan API Login");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	@Test
	public Object[][] getData()
	{
		//Need to run bikeLoanAPILogin with 3 users
		
		Object[][]  userAndPass = new  Object[3][2];
		
		//1st user credentials
		userAndPass[0][0] = "1st username";
		userAndPass[0][1] = "1st password";
		
		//2st user credentials
		userAndPass[1][0] = "2nd username";
		userAndPass[1][1] = "2nd password";
		
		//2st user credentials
		userAndPass[2][0] = "3rd username";
		userAndPass[2][1] = "3rd password";
		return userAndPass;
	}

}
