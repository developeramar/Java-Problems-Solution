import java.util.Scanner;

public class reverseWord {
    

    public static void main(String[] args) {
        
        String str;

    System.out.println("Enter the word --");
    Scanner sc =new Scanner(System.in);

    str = sc.nextLine();


    String [] splitString = str.split("\\s");
    String reverseString ="";

    for(int i=0 ; i<splitString.length ; i++){
        if(i == splitString.length-1){
            reverseString = splitString[i] + reverseString;

        }
        else{
            reverseString = " " + splitString[i] + reverseString;
        }
    }

    
    System.out.println("Original String --" + str);
    System.out.println("Reverse String --" + reverseString);

    

    }
}
