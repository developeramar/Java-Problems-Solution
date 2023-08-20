package Collections;

import java.util.ArrayDeque;

public class one {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque =
              new ArrayDeque<Integer>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
       // deque.poll();
        deque.push(10);
        System.out.println(deque);
    }
}
