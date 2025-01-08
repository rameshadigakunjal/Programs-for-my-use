JAVA PROGRAMING LANGUAGE:
PROGRAM NUMBER :3 PRIME NUMBER OR NOT
package com.myuse;
import java.util.Scanner;
class CheckPrimeOrNot{
	 public boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n/2; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
public class PrimeOrNot {
	 public static void main(String args[])
	    {
	    	CheckPrimeOrNot cp=new CheckPrimeOrNot();
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter a number:");
	    	int num=sc.nextInt();
	    	
	        if (cp.isPrime(num))
	            System.out.println(num+" is prime number");
	        else
	            System.out.println(num+" not prime number");
	      }
}

OUTPUT:
Enter a number:
21
21 not prime number
