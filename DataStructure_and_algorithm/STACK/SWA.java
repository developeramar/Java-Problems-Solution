package DataStructure_and_algorithm.STACK;

import java.util.Scanner;

public class SWA {
    
    int n = 5;
    int array2[] = new int[n];

    int top = -1;
    Scanner sc =new Scanner(System.in);

    public void push(){

        int i,ch;
        do{

            System.out.println("Enter Item --");
        if(top == n-1){
            System.out.println("Sorry,Stack is OverFlow");
        }
        else{
            i=sc.nextInt();
            top = top+1;
            array2[top] = i;
            System.out.println("Item Inserted");
        }
         System.out.println("Do you want to add more Item in stack press 1");
            ch=sc.nextInt();
        }while(ch==1);
    }

    public void pop(){
        int ch;
        do{

        if(top == 0){
            System.out.println("Sorry,Stack is Empty");
        }
        else{
            top = top-1;
            System.out.println("One Item is Deleted");
        }

         System.out.println("Do you want to delete More Item , press 2");
            ch=sc.nextInt();
        }while(ch==2);
    }

    public void display(){
        if(top == 0){
            System.out.println("Sorry,Stack is Empty");
        }else{
            for(int j=top; j>=0; j--){
                System.out.print(" "+ array2[j]);
            }
        }
        System.out.println();

    }


    public static void main(String[] args) {
        SWA s = new SWA();
        s.push();
        s.pop();
        s.display();
    }
}
