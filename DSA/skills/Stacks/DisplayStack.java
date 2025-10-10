package DSA.skills.Stacks;

import java.util.Stack;

public class DisplayStack {
    // Using recursion function
    public static void displayRec(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);

        // Using another stack
        Stack<Integer> rt = new Stack<>();

        while(st.size() > 0){
            rt.push(st.pop());
        }

        while(!rt.isEmpty()){
            int x = rt.pop();
            System.out.print(x + " ");
            st.push(x);
        } 

        System.out.println();

        // Using Array

        int n = st.size();
        int[] arr = new int[n];

        for(int i = n-1; i >= 0; i--){
            arr[i] = st.pop();
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }


        // Recursive method calling
        displayRec(st); 
    }
}
