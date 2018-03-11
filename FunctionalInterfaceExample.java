package com.isha.javabasics;


@FunctionalInterface 
interface Square{
	int square(int s);
	
}
 
public class FunctionalInterfaceExample implements Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		Square sq = (int s)->s*s;
		int result = sq.square(a);
		System.out.println(result);
		
	}

	@Override
	public int square(int s) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
