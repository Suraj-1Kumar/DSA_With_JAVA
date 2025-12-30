package DSA.skills.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            temp.add(q.poll());
        }

        while (temp.size() > 0) {
            q.add(temp.poll());
        }
    }
}
