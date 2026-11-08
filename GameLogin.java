import java.util.Scanner;

public class GameLogin
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("---welcome to the Game---");
		System.out.print("Please enter your age:");
		
		try
		{
			String ageText = scanner.nextLine();
			int age = Integer.parseInt(ageText);
			
			System.out.println("Success! You are " + age + " years old. ");
			System.out.println("Welcome to the game !");
			
		}
		catch (NumberFormatException e) 
		{
			  System.out.println("Error : Invalid input ! Please enter numbers only !");
			  System.out.println("Details:" +e.getMessage());
		}
		System.out.println("Program finished.");
		scanner.close();
	}
}
