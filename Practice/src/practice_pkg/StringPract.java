package practice_pkg;

public class StringPract {

	public static void main(String[] args) 
	{
		String str="Welcome to String class";
		System.out.println(str.length());
		String str1= "Welcome to String class";
		boolean strCompare=str.equals(str1);
		boolean strCompare1=str.equalsIgnoreCase(str);
		System.out.println("Compare results is "+strCompare);
		System.out.println("Compare ignore case "+strCompare1);
		
		System.out.println("Character at 3rd index:"+str.charAt(3));
		
		System.out.println(str.compareTo(str1));
	

		

	}

}
