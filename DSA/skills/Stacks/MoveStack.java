package DSA.skills.Stacks;

import java.util.Stack;
import java.util.Scanner;

public class MoveStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Original Stack: ");
        System.out.println(st);
        // Revesre Stack
        Stack<Integer> gt = new Stack<>();

        while(st.size() > 0){

            gt.push(st.pop());

            /*int x = st.peek();
            rev.push(x);
            st.pop(); */
        }

        System.out.println("Reversed Stack elements: ");
        System.out.println(gt);

        // Copy/Move elements in same order
        Stack<Integer> rt = new Stack<>();

        while(gt.size() > 0){
            rt.push(gt.pop());
        }

        System.out.println("Moved elements in same ordered stack: ");
        System.out.println(rt);

        sc.close();
    }  
}
