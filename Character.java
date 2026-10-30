
public class Character 
{
	private String name ;
	private int health;
	private int attackPower ;

public Character(String n , int h , int a)
{
	name=n;
	setHealth(h);
	setAttackPower(a);
}
public String getName()
{
	return name ;
}
public int getHealth()
{
	return health;
}
public int getAttackPower() 
{
	return attackPower;
}
public void setHealth(int h)
{
	if(h>=0 && h<=100) 
	{
		health=h;
	}
	else if (h<0)
	{
		health=0;
	}
	else
	{
		health=100 ;
	}
}
	public void setAttackPower(int a) 
	{
		if(a>0)
		{
			attackPower=a;
		}
	}
	public void attack(Character target) 
	{
		System.out.println(name+ "attacks" +target.getName()+ "for" +attackPower+ "damage!");
		target.setHealth(target.getHealth()-attackPower);
		System.out.println(target.getName()+ "health is now:" +target.getHealth());
	}
	
}
