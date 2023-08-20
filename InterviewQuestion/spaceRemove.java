package InterviewQuestion;
//Q. Write a Java Program to remove all white spaces from a string with using replace().

public class spaceRemove {
    public static void main(String[] args) {
        String str="Amar     Kumar     chaudhar";

        String str2 = str.replaceAll("\\s","");
        System.out.println(str2);
    }
}
