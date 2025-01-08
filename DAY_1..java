JAVA PROGRAMING LANGUAGE:
PROGRAM NUMBER :1 ADD TWO NUMBER 

import java.util.Scanner; 

public class AddTwoNumbers {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt(); 
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt(); 
        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        sc.close();
    }
}


OUTPUT:
Enter the first number: 
95
Enter the second number: 
65
The sum of 95 and 65 is: 160



PROGRAM NUMBER :2 AVERAGE OF THREE NUMBER
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble(); 

        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble(); 

        double average = (num1 + num2 + num3)/3;
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);

        sc.close();
    }
}

OUTPUT:
Enter the first number: 98
Enter the second number: 65
Enter the third number: 45
The average of 98.0, 65.0, and 45.0 is: 69.33333333333333




