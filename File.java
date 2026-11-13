import java.io.FileWriter;
import java.io.IOException;

public class File 
{
	public static void main(String[] args)
	{
		try 
		{
			FileWriter writer = new FileWriter("myData.txt");
			
			writer.write("Hello kianooush ! \n");
			writer.write("This is my first file in java .\n");
			writer.write("Welcome to File I/O.");
			
			writer.close();
			
			System.out.println("Data successfully written to file !");
		}
		catch (IOException e)
		{
			System.out.println("Error:Could not write to file");
			e.printStackTrace();
		}
		
	}
}
