package InterviewQuestion;
// Q. Write a Java Program to find the second-highest number in an array.

import java.util.Scanner;

public class Sec_Highest_number {

    public static void main(String[] args) {

        int max, secMax;
        int numArray[] = { 1, 5, 6, 2, 7, 8, 10, 20, 63 };
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < i; j++) {
                if (numArray[i] > numArray[j]) {

                    max = numArray[i];
                    // on the process

                }
            }
        }

    }
}
