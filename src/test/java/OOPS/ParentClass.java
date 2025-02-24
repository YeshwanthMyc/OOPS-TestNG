package OOPS;

import org.testng.annotations.BeforeMethod;

public class ParentClass {
	
	public void doThis()
	{
		System.out.println("Im Here");
	}
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("Run First");
	}

}
