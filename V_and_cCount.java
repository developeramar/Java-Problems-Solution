import java.util.Scanner;

public class V_and_cCount {
    

    public static void main(String[] args) {
        

        String str;
        System.out.println("Enter the String --");

        Scanner sc = new Scanner(System.in);
        int vCount =0,  cCount =0 ;

        str = sc.nextLine();

        str = str.toLowerCase();

        for(int i=0 ; i<str.length() ; i++){

            if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u'){
                vCount++;
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){

                cCount++;
            }
        }

        System.out.println("The total Vowel is  --" + vCount);
                System.out.println("The total Consonent  is -- " + cCount);




    }
}
