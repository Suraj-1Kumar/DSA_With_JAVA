package DSA.skills.Queue;
import java.util.*;

public class ReverseFirst_K_Element {
    public static Queue<Integer> reverse(Queue<Integer> q, int k){
        if(q.isEmpty() || k > q.size() || k <= 0){
            return q;
        }

        Stack<Integer> st = new Stack<>();
        int tempK = k;

        while(tempK > 0){
            st.push(q.remove());
            tempK--;
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        for(int i = 0; i < q.size() - k; i++){
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int k = 3;
        Queue<Integer> result = reverse(q, k);
        while(!result.isEmpty()){
            System.out.print(result.remove() + " ");
        }    
    }
}
