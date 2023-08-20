package InterviewQuestion;

import java.util.Scanner;

public class Parlindrome {

    public static void main(String[] args) {
        
        String oriValue,reversevalue=" ";
        
        System.out.println("Enter Any value --");
        Scanner sc = new Scanner(System.in);
        oriValue=sc.nextLine();

       
        for(int i=oriValue.length()-1; i>=0; i--){

            reversevalue = reversevalue + oriValue.charAt(i);
        }

        System.out.println();
        System.out.println("the Original value is -" + oriValue);
        System.out.println("the reverse value is -" + reversevalue);
        System.out.println();
        
        if(oriValue.equals(reversevalue)){
            System.out.println("This is Parlindrome " + oriValue);
          
        }
        else{

              System.out.println("This is not Parlindrome " + oriValue);
        }
       
    }
    
}
