package InterviewQuestion;

import java.util.Scanner;

public class Fabbonic_Number {

   
    public static void main(String[] args) {

        int a,b =0;
        int c=1;
        int num;
        System.out.println("Enter value");
        Scanner s =new Scanner(System.in);
        num=s.nextInt();

        System.out.println("Fibonacci Series of the number is:");
        for(int i=0; i<num ; i++){
          a=b;
          b=c;
          c=a+b;

         System.out.println(a +" ");


        } 
    }
}
