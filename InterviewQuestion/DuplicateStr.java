package InterviewQuestion;
// Q. Write a Java Program to find the duplicate characters in a string.

import java.util.Scanner;

public class DuplicateStr {

    public static void main(String[] args) {

        String str;
        int count = 0;
        System.out.println("Enter any str Value ---");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();

        char c[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length() - 1; j++) {
                if (c[i] == c[j]) {
                    System.out.println(c[j]);
                    count++;
                    break;

                }
            }
        }

    }

}
