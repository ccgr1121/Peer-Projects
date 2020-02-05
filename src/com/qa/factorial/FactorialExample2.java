package com.qa.factorial;

public class FactorialExample2 {
	 String temp="";
	public static String factorial(int n){ 
 
	 
	 
	  if (n == 0)    { return "1";   } 
	    
		  for (int  i = n; i >1; i--) {
			   temp=temp+ String.ValueOf(i)+"/";
			   return temp;  
		  }
	      
	 }    
	  
	  
	 public static void main(String args[]){  
	  //int i,fact=1;  
	//  int number=4;//It is the number to calculate factorial    
	  //fact = factorial(20);   
	  System.out.println( factorial(5));    
	 }  
	 
}
}
