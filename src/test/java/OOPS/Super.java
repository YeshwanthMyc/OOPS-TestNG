package OOPS;

public class Super {
	
	int a;
	public Super(int b, int c) {
		this.a=b+c;
	}

	public Super(int i) {
		this.a=i;
	}

	public int multiplyByTwo()
	{
		a=a*2;
		return a;
	}
	
	public int multiplyByThree()
	{
		a=a*3;
		return a;
	}

}
