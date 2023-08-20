package DataStructure_and_algorithm.STACK;

import java.util.Scanner;

public class StackWithAraay {
    int limit = 5;
    int array[] = new int[limit];

    int top = -1;

    Scanner sc = new Scanner(System.in);

    public void push() {

        int ch;
        

        do {

            System.out.println("Enter Item");
            if (top == limit - 1) {
                System.out.println("Stack is OverFlow ,  We cant add more data");
            } else {
                int i = sc.nextInt();
                top = top + 1;
                array[top] = i;
                System.out.println("Item Inserted--");

            }
            System.out.println("Do you want to add more data press 1 ");
            ch = sc.nextInt();
        } while (ch == 1);
    }

    public void pop() {
        int ch;
        do {

            if (top == 0) {
                System.out.println("Stack is Underflow you cant delete that Item");
            } else {
                top = top - 1;
                System.out.println("One Item Removed");
            }
            System.out.println("Do you want to delete more data press 2");
            ch = sc.nextInt();

        } while (ch == 2);

    }

    public void display() {

        if (top == 0) {
            System.out.println("Stack is Empty ");
        } else {

                for (int j=top; j>=0 ; j--){
                System.out.print( " "+ array[j]);
            }
            System.out.println();
        }

        }

    

    public static void main(String[] args) {

        StackWithAraay swa = new StackWithAraay();
        swa.push();
        swa.pop();
        swa.display();
    }

}
