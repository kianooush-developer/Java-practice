package project015;

import java.util.ArrayList;

public class Main
{
	public static int max(int a , int b) 
	{
		if (a>b) 
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
		int max = max(23,56);
		System.out.println("Max:"+max);
	}
}
