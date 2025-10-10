package DSA.skills.Stacks;
import java.util.*;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size() == 0) { 
            st.push(x);
            return;
        }

        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

     public static void reverse(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    
    // Recursive method
    public static void reverseRec(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top + " ");
        reverseRec(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            st.push(x);
        }

        Stack<Integer> gt = new Stack<>();

        while(st.size() > 0){
            gt.push(st.pop());
        }

        Stack<Integer> rt = new Stack<>();

        while(gt.size() > 0){
            rt.push(gt.pop());
        }

        while(rt.size() > 0){
            st.push(rt.pop());
        }

        System.out.println(st); 


        // Recursive method calling
        reverseRec(st);

        sc.close();
    }
}
