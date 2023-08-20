package OOPS.Inheritance;



public class Example2 {

    String name;
    String Father_name;
    int age;

    public void full_Detail(){
        System.out.println("My name is -" +name);

    
}
}

class Detail extends Example2 {
     public void detail (){
            System.out.println("My father name is  -" + Father_name);
        }
}

class All_detail extends Detail {
     public void newDetail(){
            System.out.println("My age is -" + age);
        }
}
class main {
    public static void main(String[] args) {

       All_detail ad = new All_detail();
       ad.name="Amar Kumar";
       ad.Father_name = "Shri Bhagwan Chaudhari";
       ad.age =20;

       ad.full_Detail();
       ad.detail();
       ad.newDetail();
       
        
    }
}

