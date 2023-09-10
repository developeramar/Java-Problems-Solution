package InterviewQuestion;

public class InversionCount 
{
   
   public static int getinversion(int [] A)
   {

        int count =0;

        for (int i=0 ; i<A.length-1 ; i++)
        {
            for (int j = i+1 ; j<A.length ; j++)
            {
                if(A[i] > A[j])
                {
                    count = count+1 ;
                }
            }
        }

        return count ;

    }
    
    

    public static void main(String[] args)
     {
        
        int Arr [] = {1, 9, 6, 4, 5};

        System.out.println("Inversion is " + getinversion(Arr));

    }
    
}
