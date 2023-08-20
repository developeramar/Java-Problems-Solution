package OOPS.Inheritance;

public class Example1 {
   

    String name;
    public void act (){
        System.out.println(name + " is eating now");
    }
      
}

class act_two extends Example1 {

public void act_two (){
    System.out.println(name +" is taking bath here");
}

public static void main(String[] args) {
    act_two ac =new act_two();
    ac.name="Amar_Patel";
    ac.act();
    ac.act_two();

}
}

