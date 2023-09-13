package InterviewQuestion;
// Q. Write a Java Program to find the second-highest number in an array.

import java.util.Arrays;
import java.util.Scanner;

public class Sec_Highest_number {

    public static void main(String[] args) {

        
        int numArray[] = { 1, 5, 6, 2, 7, 8, 10, 20, 63 };
        
        int len = numArray.length;

        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));

        int res = numArray[len-2];

        System.out.println("Sec largest Number is  --  "+ res);

    }
}
