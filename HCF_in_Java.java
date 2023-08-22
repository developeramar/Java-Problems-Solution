import java.util.Scanner;

public class HCF_in_Java {
    public static void main(String[] args) {
        

        int num1 , num2 , gcd;
        System.out.println("Enter number --");
        Scanner sc =new Scanner(System.in);
        num1 =sc.nextInt();
        num2 =sc.nextInt();

        gcd=num1;

        while(true){

             if((num1 %gcd ==0) && (num2%gcd ==0)){
            break;
        }else{
            gcd--;
        }

        }

        System.out.println("H.C.F of two number is --. " + gcd);
       


    }
}
