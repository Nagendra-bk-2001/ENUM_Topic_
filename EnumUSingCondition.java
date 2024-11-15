package com.Enum;
import java.lang.Enum;
enum Shape1
{
	CIRCLE,TRIANGLE,SQUARE
}
enum Weeks
{
	SUNDAY,MONDAY,Tuesday,Wednesday,Thuesday,Friday,Satuesday
}
public class EnumUSingCondition {
	public static void main(String[] args)
	{
		
		Shape1[] s1 = Shape1.values();
		for(Shape1 va : s1 )
		{
			System.out.println(va);
		}
		
		System.out.println("===============================================================");
		 
		Shape1 s = Shape1.SQUARE;
		if (s == Shape1.SQUARE)
			System.out.println("4 sides");
		else if(s == Shape1.CIRCLE)
			System.out.println("No sides");
		else if (s == Shape1.TRIANGLE)
			System.out.println("3 sides");
		
		
		System.out.println("===============================================================");
		
		
		Weeks[] w1 = Weeks.values();
		for(Weeks var : w1 )
		{
			System.out.println(var);
		}
		
		System.out.println("==============================================================="); 
		
		
		Weeks w = Weeks.MONDAY;
		
		switch(w)
		{
		case  SUNDAY :
			System.out.println("Sunday is holiday");
			break;
		case MONDAY :
			System.out.println("mondays is first day office");
			break;
		case Tuesday :
			System.out.println("Tuesday is 2");
		default :
			System.out.println("No is holiday");
			
		}
		
		Weeks w2 = Weeks.MONDAY;
		{
			System.out.println(w2.getClass());
			System.out.println(w2.getClass().getSuperclass());
		}
		
		
	}
}
