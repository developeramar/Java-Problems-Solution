package OOPS.Super_Keyword;

// this is example of method overriding and also using of super Keyword....

public class EX_One {

    public void Read(){
        System.out.println("I m reading a book Mahabhartha");
    }
    
}

class write extends EX_One{

    /*here same method available in both Super and Sub Class so, 
    we can call the super class method we have to write " Super_Keyword " */

    public void Read (){
        super.Read();               //super
        System.out.println("I m reading RAMAYANA");
        
    }
}

class Main{
    public static void main(String[] args) {
        write wt = new write();

        wt.Read();
    }
}
