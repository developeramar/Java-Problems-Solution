package DataStructure_and_algorithm.BinaryTree;

import java.util.Scanner;

public class binaryTree {

    static Node Create() {

        Scanner sc = new Scanner(System.in);
        Node root = null;
        int data;

        System.out.println("Enter root value");
        data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.println(" Enter left child value " + root.data);
        root.left = Create();

        System.out.println(" Enter right child value " + root.data);
        root.right = Create();
  
        return root;

    }

    public static void PrintInorder(Node node) {

        if (node == null) {
            return;
        }

        PrintInorder(node.left);

        System.out.print(" -> " + node.data);

        PrintInorder(node.right);

    }

    
      public static void printPreorder (Node node){

        if (node == null){
            return ;
        }

        printPreorder(node.data);

        



      }
     

    public static void main(String[] args) {

        Node root = Create();
        binaryTree bt = new binaryTree();

        PrintInorder(root);

    }
}

class Node {

    Node left;
    Node right;
    int data;

    public Node(int data) {
        left = null;
        right = null;

        this.data = data;
    }
}
