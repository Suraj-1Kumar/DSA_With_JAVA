package DSA.skills.Stacks;

import java.util.Stack;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        // manual push
        stack.push(1);
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // User input
        int n = sc.nextInt();
        for(int i = 1; i <=  n; i++){
            int x = sc.nextInt();
            stack.push(x);
        }

        // Stack display
        System.out.println(stack);

        System.out.println(stack.peek());    // Get top most element

        System.out.println(stack.pop());     // Delete top most element

        System.out.println(stack);

        System.out.println(stack.size());   // Find size of stack



        sc.close();
    }
}
