package com.VinuMichael.Test;

public class Fibonacci {
	
	public static void main(String[] args) {
	
		int t1=0, t2=1, num=10;
		for( int i=0; i<=num; i++) {
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			System.out.println(" Fibonacci series is:"+sum);
			
		}
	}
	

}
