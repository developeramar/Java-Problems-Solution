package InterviewQuestion;
import java.util.Scanner;

public class Prime_OR_NOT {
    
    public static void main(String[] args) {
        int number,result;

        System.out.println("Enter any Number");
        Scanner sc =new Scanner(System.in);
        number =sc.nextInt();

        // between given to end number
       /* 
        for(int i=0; i<=number ; i++){

            if(i % 2 !=0){
            System.out.print( " ," + i );
        }
        */

       //for any particular number
       if(number % 2!=0){
        System.out.println("This is not prime number" + " "+ number);
       }
       else{
        System.out.println("This is prime number" + " "+ number);
       }

        
      
    }
}
