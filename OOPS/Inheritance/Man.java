package OOPS.Inheritance;

// in this we are facing some problem so solveit next time

public class Man {

    String name;
    String food;
    int age;
    String behavior;

    public void action() {
        System.out.println("he want to play cricket");
    }
}

class Another_action extends Man {
    @Override
    public void action() {

        super.action();
        System.out.println("He want play footbal");
    }
}

class Detail extends Man {
    public void All_two() {
        System.out.println("Their name is -" + name);
        System.out.println("He is eating -" + food);
        System.out.println("There age is -" + age);
        System.out.println("he is -" + behavior);
    }

     
}

class Main{
     public static void main(String[] args) {
        Detail dt = new Detail();
        dt.name = "Amar";
        dt.age = 25;
        dt.food = "rice & curry";
        dt.behavior = "good";

        dt.action();
        dt.All_two();
    }
}


