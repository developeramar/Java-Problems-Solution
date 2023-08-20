package InterviewQuestion;

import java.util.Scanner;

public class strReverse {
    
    public static void main(String[] args) {
        String str ;
        System.out.println("Enter String Value -- ");

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        String ori_str = str;
        int length = str.length()-1;


        String rev ="";
        // string reversed here
        for (int i=length ; i>=0 ; i--){  

            rev = rev+str.charAt(i);
        }

        System.out.println();
        System.out.println("Revrsed String is -- " + rev);
        System.out.println();

        // also  check weather string is parlindrome or not 

        if (rev.equals(ori_str)){
            System.out.println("its a parlindrome");
        }
        else{
            System.out.println("its not parlindrome string");
        }

    }
}
