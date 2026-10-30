
public class Enemy extends Character
{
	public Enemy (String n , int h , int a)
	{
		super(n,h,a);
	}
	@Override
	public void attack(Character target)
	{
		System.out.println("Enemy:" + getName()+ " bites "+ target.getName() +"!");
		int damage = getAttackPower()-10 ;
		if (damage<0)
		{
			damage=0;
		}
		target.setHealth(target.getHealth()-damage);
		System.out.println(" Blooded " + target.getName() +" Health is now "+ target.getHealth());
		
	}
}
