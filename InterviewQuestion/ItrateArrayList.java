package InterviewQuestion;
// Q . Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

import java.util.ArrayList;
import java.util.Iterator;

public class ItrateArrayList {

    public static void main(String[] args) {
        
        ArrayList arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add("Amar");
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add("Arun");

        int size = arr.size();
        System.out.println(size);

        //-- Simple FOr Loop --

        for (int i=0; i<size ; i++){
            System.out.println(arr.get(i));
        }



         //while loop

         System.out.println(" Through While Loop ");
       
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //using Advanced for-loop
        System.out.println("using Advanced for-loop--");

        for (Object element : arr){
            System.out.println(element);
        }

    
    }
    
}
