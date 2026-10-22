
public class SportsCar extends Vehicle
{
	
	private boolean hasTurbo;

	public SportsCar(String c,int s,boolean t)
	{
		super(c,s);
		hasTurbo=t;
	}
	public void boost() 
	{
		if (hasTurbo) 
		{
			System.out.println("BOOST!! Speed increased.");
		}
		else
		{
			System.out.println("No turbo available.");
		}
	}
	public static void main(String[] args)
	{
		SportsCar myCar = new SportsCar("Red",180,true);
		myCar.move();
		myCar.boost();
		System.out.println("Color:"+myCar.getColor() +"| Speed:"+myCar.getSpeed());
	}

}
