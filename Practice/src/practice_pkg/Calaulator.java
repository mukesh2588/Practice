package practice_pkg;

public class Calaulator
{
	public void add()
	{
		int a=10;
		int b=20;
		int c= a + b;
		System.out.println("Value of addition is:"+ c);
		
	}
	
	public void sub()
	{
		int a=200;
		int b=40;
		int c= a-b;
		System.out.println("Valus of subtraction is :"+ c);
	}
	
	public int add1(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
	

	public static void add2(int a, int b) {
		int c=a+b;
		System.out.println("Valus from static method: " +c);
		
	}

}
