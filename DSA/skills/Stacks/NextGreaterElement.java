package DSA.skills.Stacks;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] solve(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n-1]);

        for(int i = n-2; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            } else{
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);  
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 8, 6, 4, 3, 7, 2, 1};

        int[] ans = solve(arr);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
