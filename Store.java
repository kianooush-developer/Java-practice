import java.util.HashMap;

public class Store
{
	public static void main(String[] args)
	{
		HashMap<String , Integer> products = new HashMap<>();
		
		products.put("Laptop", 14000000);
		products.put("Mouse", 350000);
		products.put("Keyboard", 550000);
		products.put("Monitor",700000);
		
		System.out.println("Store Inventory" + products);
		System.out.println(("-------------------------"));
		
		int laptopPrice = products.get("Laptop");
		System.out.println("Laptop price: $" + laptopPrice);
		
		System.out.println("Do we have Mouse ?" +products.containsKey("Mouse"));
		System.out.println("Do we have Printer ?" +products.containsKey("Printer"));
		
		products.remove("Laptop");
		System.out.println("After removig Laptop :" +products);
		
		System.out.println("Total products:" + products.size());
		
		System.out.println("----All products-----");
		for(String Key : products.keySet()) 
		{
			System.out.println(Key + " costs $ " +products.get(Key));
		}
}
}
