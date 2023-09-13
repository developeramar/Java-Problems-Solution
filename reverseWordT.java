import java.util.Scanner;

public class reverseWordT {

    public static void main(String[] args) {
        

        String originalString;

        System.out.print("Enter any string -- ");

        Scanner sct = new Scanner(System.in);

        originalString =sct.nextLine();

        String [] word = originalString.split("\\s");

        String reverseString="";

        for(int i=0 ; i<word.length ; i++){
            if(i == word.length-1){
               
                reverseString = word[i] + reverseString;
            }
            else{
                reverseString = " " + word[i] + reverseString;
            }
        }

        System.out.println("Original String -- " + originalString);
        System.out.println("Reverse String ----" + reverseString);

    }
    
}
