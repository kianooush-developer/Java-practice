
public class ErrorHandling 
{
	public static void main(String[] args) 
	{
		System.out.println("Program started...");
		try 
		{
			int result=10/0 ;
			System.out.println("Result:" + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:You cannot divide by zero !");
			System.out.println("Details: " +e.getMessage());
		}
		System.out.println("Program finished successfully !");
	}
}
