package InterviewQuestion;

public class Armstrong_Num {

    public static void main(String[] args) {

        int c = 0, a, temp;
        int num = 153;
        temp = num;

        while (num > 0) {
            a = num % 10;
            num = num / 10;
            c = c + (a * a * a);

            if (temp == c) {
                System.out.println("armstrong number");
            }

            else {
                System.out.println("Not armstrong number");

            }

        }

    }
}
