package InterviewQuestion;

public class Automorphic {
    

    public boolean isAutomorphic(int num){

        int square  = num*num;

        while(num > 0){

            if(num % 10 != square %10){
                return false;
            }
            num /=10;
            square /=10;
        }
        return true;
    }



    public static void main(String[] args) {
       Automorphic tt = new Automorphic();

       boolean result = tt.isAutomorphic(76);

       System.out.println(result);
    }

}
