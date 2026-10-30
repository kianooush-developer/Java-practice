
public class Hero extends Character
{
	public Hero(String n ,int h , int a) 
	{
		super(n,h,a);
	}
	@Override
	public void attack(Character target) 
	{
		System.out.println("Hero:"+getName()+" swings a mighty sword at "+ target.getName() + "!");
		int specialDamage=getAttackPower() + 10 ;
		target.setHealth(target.getHealth()-specialDamage);
		System.out.println("Critical Hit :" + target.getName() + " Health is now :" + target.getHealth());
	}
	public static void main(String[] args) 
	{
		Hero myHero = new Hero("Kia",100,20);
		Enemy boss = new Enemy("Dark lord",100,20);
		
		System.out.println("..................Battle  Start.....................");
		
		myHero.attack(boss);
		System.out.println("................................................");
		boss.attack(myHero);
		System.out.println("................Game over.....................");
	}
}


