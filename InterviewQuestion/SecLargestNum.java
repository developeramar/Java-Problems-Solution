package InterviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

//  Write a program to find the second-largest number in an array of integers

public class SecLargestNum {

    public static void main(String[] args) {
        /*
         * int num [] = {10,20,25,30,40,60,80};
         * int size = num.length;
         * 
         * //sort form
         * 
         * Arrays.sort(num);
         * System.out.println(Arrays.toString(num));
         * 
         * int res = num[size-2];
         * System.out.println("The second largest number is ---" + res);
         */

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array ");
        size = sc.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        int len = number.length;
      
        Arrays.sort(number);
        System.out.println(" " + Arrays.toString(number));
        int res = number[len - 2];
        System.out.println("The second largest number is --" + res);

    }

}
