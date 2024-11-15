package com.Enum;

enum Shapes
{
	//0    1        2 
	CIRLE,TRIANGLE,SQUARE
}
public class EnumBasic {

	public static void main(String[] args) {
		
		System.out.println(Shapes.CIRLE);
		
		Shapes sh = Shapes.CIRLE;
		System.out.println(sh.ordinal());//its used index of arrays
		
		Shapes sh2 = Shapes.SQUARE;
		System.out.println(sh2.ordinal());
		
		Shapes[] sh1 = Shapes.values();
		for(Shapes val : sh1)
		{
			System.out.println(val);
		}

	}

}
