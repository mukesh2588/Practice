package practice_pkg;


public class Sample {


	int a=100;
	int b=200;
	static
	{
		System.out.println("Before main");
	}

	public static void main(String[] args) 
	{
		Sample obj= new Sample();
		obj.add();

		Calaulator calc= new Calaulator();
		calc.sub();
		calc.add();

	}

	public void add()
	{
		int a=10;
		int b=30;
		int c= a+b;

		System.out.println("value of c is:" + c);
	}

}
