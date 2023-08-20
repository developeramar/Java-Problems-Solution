import java.util.Scanner;

public class Min_in_Array {
    public static void main(String[] args) {
        

        int a[] = {1,2,3,4,5,6,7,8,9,10};

        int min = a[0];
       
       
      

        for(int i=1; i<a.length ; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum Number is ----" + min);
    }
}
