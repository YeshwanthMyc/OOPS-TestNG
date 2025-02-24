package OOPS;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {
	
	@Test
	public void testRun() {
		doThis();
	}
	
	@Test
	public void testRun1()
	{
		constructor cons = new constructor(5,5);
		System.out.println(cons.increment());
		System.out.println(cons.decrement());
		System.out.println(cons.multiplyByThree());
	}
}
