
public class Car 
{
	private String color ;
	private int speed ;
	public Car(String c , int s) 
	{
		color=c;
		speed=s;
	}
	public String getColor()
	{
		return color ;
	}
	public int getSpeed() 
	{
		return speed;
	}
	public void setColor(String c)
	{
		color=c;
	}
	public void setSpeed(int s)
	{
		if (s>=0) 
		{
			speed=s;
		}
		else
		{
			System.out.println("Error:speed can not be negative !");
		}
	}
	public void showInfo()
	{
		System.out.println("color:"+color+"_"+"speed:"+speed);
	}
	public static void main(String[] args)
	{
		Car car1=new Car("Red",300)	;
		System.out.println("My car color is:"+car1.getColor());
		car1.setSpeed(350);
		car1.showInfo();
		car1.setSpeed(-180);
		car1.showInfo();
	}
}

