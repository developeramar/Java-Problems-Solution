import java.util.Scanner;

public class odd_add_ {
    

   
public class OddDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int oddDigitSum = calculateOddDigitSum(number);
        
        System.out.println("Sum of odd digits: " + oddDigitSum);
        
        scanner.close();
    }
    
    public static int calculateOddDigitSum(long number) {
        int sum = 0;
        
        while (number > 0) {
            int digit = (int)(number % 10);
            if (digit % 2 != 0) { // Check if the digit is odd
                sum += digit;
            }
            number /= 10;
        }
        
        return sum;
    }
}




    }

