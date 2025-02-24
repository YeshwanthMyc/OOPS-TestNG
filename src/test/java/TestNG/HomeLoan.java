package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {
	
	@Test(enabled = false)
	public void homeLoanMobileLogin()
	{
		System.out.println("Home Loan Mobile Login");
	}
	
	@Test(timeOut = 4000)
	public void homeLoanwebLogin()
	{
		System.out.println("Home Loan Web Login");
	}
	
	@Test(dependsOnMethods = {"homeLoanwebLogin"})
	public void homeLoanAPILogin()
	{
		System.out.println("Home Loan API Login");
	}
	
	@BeforeTest
	public void prerequisite() 
	{
		System.out.println("I will Execute first in home loan");
	}
	
	@AfterTest
	public void lastExecution() 
	{
		System.out.println("I will Execute last in home loan");
	}



}
