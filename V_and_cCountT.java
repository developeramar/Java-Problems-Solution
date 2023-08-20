import java.util.Scanner;

public class V_and_cCountT {
    public static void main(String[] args) {
        
        String str;
        System.out.print("Enter Strings --");

        Scanner sc = new Scanner(System.in);
        str =sc.nextLine();

        int vCount =0 , cCount =0;


        str = str.toLowerCase();

        for(int i=0 ; i<str.length() ; i++){

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    vCount++;
            }
            else if (str.charAt(i) >='a' && str.charAt(i) <= 'z'){
                cCount++;
            }

        }

        System.out.println("Total Vowel ---" + vCount);
        System.out.println("Total Consonent ---" + cCount );

    }
}
