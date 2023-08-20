
// here we are using Super keyword for Constructor Overriding....

public class Ex_Two {

    Ex_Two(){
        System.out.println("Hi, I m Constructor first ");
    }
}

/*Here In both class there two constructor */

class NewOne extends Ex_Two{
    NewOne(){
        super();
        System.out.println("-- This is second constructor --");
    }
}

class main
{
    public static void main(String[] args) {
        NewOne nw = new NewOne();
    }
}
