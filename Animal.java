
public abstract class Animal 
{
	protected String name ;
	public Animal(String n)
	{
		name = n ;
	}
	public void sleep()
	{
		System.out.println(name+ " is sleeping..." );
	}
	public abstract void makeSound();
}
