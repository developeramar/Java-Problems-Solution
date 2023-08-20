import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        
        int b,h;

        System.out.println("Enter the b and h value --");

        Scanner sc =new Scanner(System.in);
        b=sc.nextInt();
        h=sc.nextInt();

        int area = (b*h)*1/2;
        System.out.println("Area of triange is -- " + area);

      //  r=sc.nextInt();
       // int result = 22/7 * r*2+r; //Area of triange
      //  System.out.println("Area of circle is -" + result);


    }
}
