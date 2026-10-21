
public class Student 
{
	private String name ;
	private int age ;
	private double score ;

	public Student (String n , int a , double s) 
	{
		name=n;
		setAge(a);
		setScore(s);
	}
	public String getName() 
	{
		return name ;
	}
	public int getAge()
	{
		return age ;
	}
	public double getScore()
	{
		return score ;
	}
	public void setName(String n)
	{
		name =n;
	}
	public void setAge(int a)
	{
		if(a>0)
		{
			age=a;
		}
		else
		{
			System.out.println("Error: age cannot be negative !");
		}
	}
	public void setScore(double s) 
	{
		if (s>=0 && s<=20)
		{
			score=s;
		}
		else 
		{
			System.out.println("Error:Score must be between 0 and 20 !!");
		}
	}
	public void showInfo() 
	{
		System.out.println("Name:"+name+"| Age:"+age+"|Score:"+score);
	}
	public static void main(String[] args) 
	{
		Student st1 = new Student("kia",35,19.99);
		st1.showInfo();
		st1.setAge(-13);
		st1.setScore(23);
		st1.showInfo();
	}
}