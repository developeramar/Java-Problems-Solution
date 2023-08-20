package InterviewQuestion;

import java.util.Scanner;

public class numReverse {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter any number --");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int ori_num = num;
        int rev = 0;
       

        while (num != 0) {

            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        // also check here the given number is parlindrome or not --
       System.out.println("Reverse Number is -" + rev);

       if(ori_num == rev){
        System.out.println(ori_num +" " + " is parlindrome number");
       }

       else{
        System.out.println("Not a parlindrome number");
       }
      
    }
}
