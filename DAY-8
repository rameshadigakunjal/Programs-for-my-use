JAVA PROGRAMING LANGUAGE:
PROGRAM NUMBER :8 STATIC KEY EXAMPLE:
package com.myuse;

import java.util.Scanner;

class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static int subtract(int a, int b) {
        return a - b;
    }

    
    public static int multiply(int a, int b) {
        return a * b;
    }

   
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }
}


public class Staticex {
	  public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = Calculator.add(num1, num2);
        int difference = Calculator.subtract(num1, num2);
        int product = Calculator.multiply(num1, num2);
        double quotient = Calculator.divide(num1, num2);

        
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.printf("Quotient:"+ quotient);

	}
}

OUTPUT:
Enter first number: 10
Enter second number: 20

Results:
Sum: 30
Difference: -10
Product: 200
Quotient:0.5
