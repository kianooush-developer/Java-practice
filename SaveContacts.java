import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class SaveContacts 
{
	public static void main(String[] args) 
	{
		HashMap<String,String>contacts=new HashMap<>();
		contacts.put("Ali", "09102005439");
		contacts.put("Reza", "09113004276");
		contacts.put("Abbas", "09127184623");
		
		try 
		{
			FileWriter writer = new FileWriter("contacts.txt");
			for(String name : contacts.keySet()) 
			{
				String phone = contacts.get(name);
				writer.write(name+ "," + phone + "\n");
			}
			writer.close();
			System.out.println("Contacts saved to successfully !");
			
		}
		catch(IOException e) 
		{
			System.out.println(" Error: Could not save contacts ");
			e.printStackTrace();
		}
	}
}
