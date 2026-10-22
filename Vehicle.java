
public class Vehicle
{
	protected String color ;
	protected int speed ;
	
	public Vehicle (String c , int s) 
	{
		color = c ;
		speed=s;
	}
	public void move() 
	{
		System.out.println("Vehicle is moving at " +speed+ "km/h.");
	}
	public String getColor()
	{
		return color ;
	}
	public int getSpeed()
	{
		return speed ;
	}

}
