package DSA.skills.Stacks;

import java.util.Stack;

public class RemoveCnsecutiveSubsequence {
    public static int[] remove(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(stack.isEmpty() || stack.peek() != arr[i]){
                stack.push(arr[i]);
            } else if(stack.peek() == arr[i]){
                if(i == n-1|| arr[i] != arr[i+1]){
                    stack.pop();
                }
            }
        }
        int m = stack.size();
        int[] ans = new int[m];

        for(int i = m-1; i >= 0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        int[] result = remove(arr);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
