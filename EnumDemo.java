package com.Enum;

enum level
{
	BEGINNER("B"),INTERMEDIATE("I"),ADAVENCE("A");
	
	private String abbr;
	private level(String ab)
	{
		abbr = ab;
	}
	String getAbbr()
	{
		return abbr;
	}
}
class  EnumDemo {
	public static void main(String[] args)
	{
		level[] l0 = level.values();
		for(level v : l0)
		{
			System.out.println(v);
		}
		
		System.out.println("==============================================================="); 
		
		level l1 = level.ADAVENCE;
		System.out.println(l1);
		System.out.println(l1.getAbbr());
		
		
		System.out.println("==============================================================="); 
		
		level l2 = level.BEGINNER;
		System.out.println(l2);
		System.out.println(l2.getAbbr());
		
		System.out.println("==============================================================="); 
		
		level l3 = level.INTERMEDIATE;
		System.out.println(l3);
		System.out.println(l3.getAbbr());
		
	}
}
