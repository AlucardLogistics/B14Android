package com.dragos.assigments;

public class Assigments {
	
public static void main (String args[])  {
		
        int n = 9;
        System.out.println("Fibonacci: " + fib(n));
        int a = 10;
        System.out.println("is prime?: " + isPrime(a));
        int b = 4564;
        isPalindrome(b);
        int c = 5;
        System.out.println("Factorial of " + c + " is " + factorial(c));
        int d = 123;
        isArmstrongNumber(d);
        
    }
	

	//fibonacci series
	static int fib(int n) {
	    int a = 0, b = 1, c;
	    if (n == 0)
	        return a;
	    for (int i = 2; i <= n; i++)
	    {
	        c = a + b;
	        a = b;
	        b = c;
	    }
	    return b;
	}
	
	//checks whether an int is prime or not.
	static boolean isPrime(int n) {
		for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	//palindrome number
	 static boolean isPalindrome(int n) {
		 int r, sum = 0, temp;		  
		 int initialNumber = n;
		  temp = n;  
		  
		  while(n > 0){    
		   r = n%10;  //getting remainder  
		   sum = (sum*10)+r;    
		   n = n/10;    
		  }    
		  if(temp==sum)    {
			  System.out.println(initialNumber + " is palindrome number.");    
			  return true;
		  } else {
			  System.out.println(initialNumber + " is not palindrome number.");
			  return false;
		  }    		  
	}
	 
	// Method to find factorial of given number
    static int factorial(int n) {
        int res = 1;
        for (int i=2; i<=n; i++)
            res *= i;
        return res;
    }
    
    //armstrong number
    static boolean isArmstrongNumber(int n) {
    	int c = 0, a, temp;   
    	int initialNumber = n;
        temp = n;  
        
        while(n > 0) {  
        a = n%10;  
        n = n/10;  
        c = c+(a*a*a);  
        }
        
        if(temp == c) {
        	System.out.println(initialNumber + " is armstrong number.");
        	return true;
        } else {
            System.out.println(initialNumber + " is not armstrong number.");
            return false;
        }
    }   
    

}
