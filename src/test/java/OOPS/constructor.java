package OOPS;


public class constructor extends Super{
	
	int a;
	
	
	public constructor(int i) {
		super(i);
		this.a=i;
	}
	
	public constructor(int b, int c)
	{
		super(b,c);
		this.a=b+c;
	}

	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decrement()
	{
		a=a-1;
		return a;
	}

}
