package Java_StringPracticeQuestion;

public class first {
    
        public static void main(String[] args) {
            String s1 = "hello";
            String s2 = new String("hello");
            String s3 = "hello";
            if (s1 == s2) {
                System.out.println("s1 and s2 equal");
            } else {
                System.out.println("s1 and s2 not equal");
            }
            if (s1 == s3) {
                System.out.println("s1 and s3 equal");
            } else {
                System.out.println("s1 and s3 not equal");
            }
        }
    }

