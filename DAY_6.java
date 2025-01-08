JAVA PROGRAMING LANGUAGE:
PROGRAM NUMBER :6 Armstrong numbe  in java
import java.util.Scanner;

public class ArmstrongNumberSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Store original number
        int original = number;
        int sum = 0;
        
        // Calculate the sum of cubes of digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit; // cube of the digit
            number /= 10;
        }
        
        // Check if the sum equals the original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}
OUTPUT:
Enter a number: 123
123 is not an Armstrong number.

Enter a number: 153
153 is an Armstrong number.

