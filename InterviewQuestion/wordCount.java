package InterviewQuestion;

import java.util.HashMap;

public class wordCount {
    
    public static void main(String[] args) {
        
        String str = "This is is pen pen and paper paper ";
        String []split = str.split(" ");

        HashMap < String , Integer > map = new HashMap<>();

        for(int i = 0 ; i<= split.length-1 ; i++){

            if(map.containsKey(split[i])){

                int count = map.get(split[i]);

                map.put(split[i], count+1);
            }
            else{
                map.put(split[i], 1);
            }
        }

        System.out.println(map);
    }
}
