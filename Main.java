package project015;

import java.util.ArrayList;

public class Main
{
	public static int min(int a , int b) 
	{
		if (a<b) 
		{
			return a ;
		}
		else
		{
			return b ;
		}
	}
	public static void main(String[] args) 
	{
		int result = min(23,56);
		System.out.println("Min:"+result);
	}
}
