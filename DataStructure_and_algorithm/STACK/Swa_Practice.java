package DataStructure_and_algorithm.STACK;

import java.util.Scanner;

public class Swa_Practice {
    
     int n = 6;
     int arr[] = new int[n];
     int top=-1;

     Scanner sc =new Scanner(System.in);

     public void push(){
        int i,ch;

        do{

        System.out.println("Enter Item in Stack --");

        if(top ==n-1){
            System.out.println("Stack is Overflow , you can't add more --");
        }
        else{
            i =sc.nextInt();
            top = top+1;
            arr[top] = i;
            System.out.println("Item Inserted --");
        }
         System.out.println("Do you want to add more data press 1");
            ch=sc.nextInt();
        }while(ch==1);
     }

     public void pop (){
        int ch;

        do{
            
        if(top ==0){
            System.out.println("Stack is Underflow , You can't delete more --");
        }
        else{
            top = top-1;
            System.out.println("One Item is Removed");
        }
        System.out.println("Do you want to delete more data press 2");
            ch = sc.nextInt();

        }while(ch==2);
     }

     public void display(){
        if(top == 0){
            System.out.println("Stack Is Empty , there is no any item available --");
        }
        else{
            for(int j=top;j>0;j--){
                System.out.println(" "+ arr[j]);
            }
        }
     }
     
     public static void main(String[] args) {
        Swa_Practice sp =new Swa_Practice();

        System.out.println();
        System.out.println("1 - Add element In stack");
        System.out.println("2 - Delete the Element from stack");
        System.out.println("3 - Display Item");
        System.out.println();

        System.out.println("Enter your Choice -");

        Scanner sc =new Scanner(System.in);
        int ch,ch2;
        
            sp.push();
            sp.pop();
            sp.display();
            
     }

}
