package DSA.skills.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InsertElementStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.println("Orignial stack: \n" +  st);
        int x = sc.nextInt();      // Element to be inserted
        int idx = sc.nextInt();    // Index of insertion

        Stack<Integer> rt = new Stack<>();   // new stack 

        while(st.size() > idx){
            rt.push(st.pop());
        }

        st.push(x);             // insert desired element

        while(rt.size() > 0){
            st.push(rt.pop());
        }

        System.out.println("After inserting the element: ");
        System.out.println(st);
        
        sc.close();
    }
}
