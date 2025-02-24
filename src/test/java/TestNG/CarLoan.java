package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {
	
	@Test
	public void carLoanMobileLogin()
	{
		System.out.println("Car Loan Mobile Login");
	}
	
	@Test
	public void carLoanwebLogin()
	{
		System.out.println("Car Loan Web Login");
	}
	
	@Test
	public void carLoanAPILogin()
	{
		System.out.println("Car Loan API Login");
	}
	
	@BeforeTest
	public void prerequisite() 
	{
		System.out.println("I will Execute first in car loan");
	}
	
	@AfterTest
	public void lastExecutionInTest() 
	{
		System.out.println("I will Execute last in car loan");
	}
	
	@BeforeSuite
	public void veryFirstExecution()
	{
		System.out.println("I will execute first in suite");
	}
	
	@AfterSuite
	public void lastExecutionInSuite()
	{
		System.out.println("I will execute last in suite");
	}
	
	@BeforeMethod
	public void executeBeforeEveryMethod() {
		System.out.println("I will execute before every method");
	}
	
	@AfterMethod
	public void executeAfterEveryMethod() {
		System.out.println("I will execute after every method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I will execute  before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("I will execute after class");
	}

}
