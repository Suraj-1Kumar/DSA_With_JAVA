package DSA.skills.Queue;

import java.util.*;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(1);
        System.out.println(queue.element());
        queue.add(3);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(7);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
