package exception;

public class Example1 {
	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		try
		{
			
			int c=a/b;
			System.out.println(c);
			
		}
catch(ArithmeticException e)
		{
		System.out.println(e);
	}
		finally
		{
			
			System.out.println(a+b);
		}
System.out.println("Handled Exception");
}
}