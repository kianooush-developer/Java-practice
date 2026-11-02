import java.util.HashMap;

public class PhoneBook 
{
	public static void main(String[] args) 
	{
		HashMap<String,String>contacts =new HashMap<>();
		
		contacts.put("Ali","09102005439");
		contacts.put("reza","09113004356");
		contacts.put("Abbas","09138004567");
		
		System.out.println("phoneBook:"+contacts);
		System.out.println("-------------------");
		
		String AliPhone = contacts.get("Ali");
		System.out.println("Ali's phone is :"+AliPhone);
		
		System.out.println("Is Ali in Contacts?" +contacts.containsKey("Ali"));
		System.out.println("Is kianooush in Contacts?" +contacts.containsKey("kianooush"));
		
		contacts.remove("Ali");
		System.out.println("After removing Ali:"+ contacts);
		
		System.out.println("Total contacts:" +contacts.size());
	}
}
