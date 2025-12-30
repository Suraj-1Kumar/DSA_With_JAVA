package DSA.skills.Stacks;

import java.util.*;

class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList();
    }
    
    public void push(int x) {
        queue.add(x);
        for(int i = 0; i < queue.size()-1; i++){
            queue.add(queue.poll());
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        if(queue.size() == 0) return true;
        else return false;
    }
}
public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // return 2
        System.out.println(stack.pop());   // return 2
        System.out.println(stack.empty()); // return false
        
    }
}
