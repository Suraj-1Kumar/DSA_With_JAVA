package DSA.skills.Stacks;

import java.util.*;

public class RemoveElementStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        // manual push
        stack.push(1);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack);

        int idx = sc.nextInt();

        Stack<Integer> rt = new Stack<>();

        while(stack.size() > idx){
            rt.push(stack.pop());
        }
        
        stack.pop();

        while(rt.size() > 0){
            stack.push(rt.pop());
        }

        System.out.println(stack);

        sc.close();
    }
}
