package com.VinuMichael.Test;

public class Factorial {
	
	public static void main(String[] args) {
		int num=6, fact=1;
		for(int i=2; i<num; i++)
		{
			fact=fact*i;
		}
		System.out.println(" Factorial of a num is "+fact);
	}

}
