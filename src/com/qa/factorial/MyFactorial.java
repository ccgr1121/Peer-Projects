package com.qa.factorial;

public class MyFactorial {

	public static void main(String[] args) {
        int number=4;
		int fact = 1;
		for( int i = number;i >1;i--) {
			fact = fact* (i);
		}
		
		System.out.println(fact);

	}
  
	
	
}
