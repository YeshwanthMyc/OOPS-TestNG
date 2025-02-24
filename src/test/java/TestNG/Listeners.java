package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Listener success");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Listener failure .......");
	}
	
	

}
