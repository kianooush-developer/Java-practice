
public class Dog extends Animal
{
	public Dog(String n) 
	{
		super(n) ;
	}
	@Override
	public void makeSound()
	{
		System.out.println(name+ " says: Woof Woof!");
	}
	public static void main(String[] args)
	{
		Dog myDog = new Dog("Max");
		myDog.sleep();
		myDog.makeSound();
	}
}
