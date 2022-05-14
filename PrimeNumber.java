package com.VinuMichael.Test;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		boolean prime = true;
		for (int i=2; i<num; i++)
		{
			if(num% i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime)
		{
			System.out.println(num+ " is a prime number ");
		}
		else
			System.out.println("is not a prime number");
	}
}
