
public class Calculator {

	public static void main(String[] args) {

		int a=50; 
		int b=30, q;
		System.out.println("Result of addition is " + add(a,b));
		System.out.println("Result of subtraction is " + subtract(a,b));
	}
	
	public static int add(int a, int b) 
	{
		return(a+b);
	}
	
	public static int subtract(int a, int b) 
	{
		return(a-b);
	}

}
