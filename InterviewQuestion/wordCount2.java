package InterviewQuestion;

import java.util.HashMap;

public class wordCount2 {
    

    public static void main(String[] args) {
        
        String str = "1,1,2,33,4,4,5,6";
        String []str1 =str.split(",");

        HashMap <String , Integer> map = new HashMap<>();

        for(int i = 0; i<=str1.length-1 ; i++){
            if(map.containsKey(str1[i])){
                int count =map.get(str1[i]);
                map.put(str1[i], count+1);


            }
            else{
                 map.put(str1[i], 1);
            }
        }

        System.out.println(map);

    }

}
