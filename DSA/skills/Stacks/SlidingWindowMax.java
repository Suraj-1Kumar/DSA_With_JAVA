package DSA.skills.Stacks;

import java.util.Stack;

public class SlidingWindowMax {
    public static int[] slidingWindowMax(int[] arr, int k) {
        // Implementation goes here
        int n = arr.length;
        int[] result = new int[n - k + 1];
        int z = 0;
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[n];
        stack.push(n-1);
        nge[n-1] = n;

        for(int i = n-2; i >= 0; i--){
            while(stack.size() > 0 && arr[i] > arr[stack.peek()]) stack.pop();
            if(stack.size() == 0) nge[i] = n;
            else nge[i] = stack.peek();
            stack.push(i);
        }

        int j = 0;
        for(int i = 0; i < n-k+1; i++){
            if(j >= i+k) j = i;
            int max = arr[j];
            while(j < i+k){
                max = arr[j];
                j = nge[j];
            }
            result[z++] = max;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = slidingWindowMax(arr, k);
        for(int val : result){
            System.out.print(val + " ");
        }
        
    }
}
