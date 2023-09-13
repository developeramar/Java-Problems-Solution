package InterviewQuestion;

import java.util.Scanner;

public class lastAddNumber {

    public static void main(String[] args) {
        
        int limit;
        System.out.println("Enter limit --");
        Scanner sc =new Scanner(System.in);
        limit = sc.nextInt();

        int arr [] = new int[limit];

        System.out.print ("Before Increment array --" +" ");

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0 ;i <arr.length ; i++){
            arr[i] = arr[i]+1 ;
        }

         System.out.print ("After Increment array --" +" ");

         for(int i=0 ; i<arr.length ; i++){
            System.out.print(" "+ arr[i]);
         }
        

    }

}
