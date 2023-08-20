package DataStructure_and_algorithm.STACK;

import java.util.Scanner;


// :-- Stack implementation Using LinkedList --:

public class StackWithLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    Node top = null;

    public void push() {
        int data , ch;

        do{
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data --");
        data = sc.nextInt();

        Node new_node = new Node(data);

        if (top == null) {
            top = new_node;
        } else {

            new_node.next = top;
            top = new_node;
        }

             System.out.println("Do you want to add more data press 1");
            ch=sc.nextInt();
        }while(ch==1);
    }

    public void pop() {
        int ch;
        Scanner sc =new Scanner (System.in);
        do{
            
        if(top ==null){
            System.out.println("Sorry ,Stack is already Empty -- ");
        }
        else{
            top = top.next;
        }
        System.out.println("Do you want to delete more data press 2 --");
            ch = sc.nextInt();
        }while(ch==2);

    }

    public void display(){

        Node temp = top;

        if(top ==null){
            System.out.println("Sorry ,Stack is already Empty -- ");
        }

    else{
        while(temp!=null){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }


    }

    public static void main(String[] args) {

        StackWithLinkedList swl =new StackWithLinkedList();
        swl.push();
        swl.pop();
        swl.display();

    }

}
