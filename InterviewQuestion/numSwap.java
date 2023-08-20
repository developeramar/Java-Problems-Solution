package InterviewQuestion;
// Q #3) Write a Java Program to swap two numbers using the third variable.


import java.util.Scanner;

public class numSwap {
    public static void main(String[] args) {

        int num1, num2, temp, ch;

        do {

            System.out.println("Enter First num1 Value -- " );
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextInt();

            System.out.println("Enter First num2 Value -- " );
            num2 = sc.nextInt();

            System.out.println("before swapping --" +" "+num2 +" "+num1);
            temp = num2;
            num2 = num1;
            num1 = temp;

            System.out.println("after swapping" +" "+num2 +" "+ num1);
            

            System.out.println("Do you want to Swap again press 1");
            Scanner s = new Scanner(System.in);
            ch = s.nextInt();

        } while (ch == 1);











        // Q #3) Write a Java Program to swap two numbers without using the third variable.

    do {

            System.out.println("Enter First num1 Value -- " );
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextInt();

            System.out.println("Enter First num2 Value -- " );
            num2 = sc.nextInt();

            System.out.println("before swapping --" +" "+ num2 +" " +num1);

            num1=num1+num2;
            num2=num1-num2;
            num1 =num1-num2;

             System.out.println("after swapping" +" "+num2 +" "+num1);


             System.out.println("Do you want to Swap again press 1");
            Scanner s = new Scanner(System.in);
            ch = s.nextInt();

        } while (ch == 1);

    }





    



}
