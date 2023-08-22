import java.util.Scanner;

public class Count_Total_Number_of_Digits {

    public static void main(String[] args) {
        

        int num , totalDigit=0;

        System.out.println("Enter numbers --");
        Scanner sc =new Scanner(System.in);
        num = sc.nextInt();

        while(num !=0){
            totalDigit++;
            num = num/10;
        }

        System.out.println("Total Digit is --" + totalDigit);

    }
    
}
