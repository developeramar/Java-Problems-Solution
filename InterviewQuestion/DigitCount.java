package InterviewQuestion;

public class DigitCount {

    public static void main(String[] args) {
        int num = 52463;

        int count = 0;
        int odd_count =0;
        int even_count = 0;

        //simple digit count in a given number
       /*   while (num > 0) {

            num = num / 10;
            count++;
        }

        System.out.println("Total Digit is --" + count);

        */

        while(num>0){

            int rem = num / 10;
            if(rem %2 ==0){
               
                even_count++;
            }

            else {
                
                odd_count++;
            }

            num = num/10;

        }

        System.out.println("even count is -- " + even_count);
        System.out.println("odd count is " +odd_count);


    }
}
