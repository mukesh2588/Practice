package practice_pkg;

public class MethodPract {

	public static void main(String[] args)
	{
		MethodPract obj1= new MethodPract();
		obj1.sum1(10, 20);

		int c=obj1.sum2(30, 40);

		System.out.println("Sum of value with return method "+c);

		String fullName=obj1.combine("Mukesh", " Khedkar");
		System.out.println("Combined string value is: "+fullName);

		/*	Calaulator obj2=new Calaulator();
		int s=obj2.add1(3, 5);
		System.out.println("Addition with return type mthod is :"+s);
		 */


		//Static method from Calaulator class calling without creating object
		
		Calaulator.add2(11, 7);
		


	}

	public void sum1(int a, int b)
	{
		int x= a+b;
		System.out.println("Value of sum "+x);
	}

	public int sum2(int a, int b)
	{
		int c =a+b;
		return c;

	}

	public String combine(String fName, String lName)
	{
		String fullName=fName+lName;

		return fullName;

	}

}
