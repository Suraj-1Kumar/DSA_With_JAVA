package DSA.skills.Stacks;

import java.util.Stack;

public class StockSpan {
    public static int[] optimizedWay(int[] arr){
        int n = arr.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        stack.push(0);
        span[0] = 1;
        
        for(int i = 1; i < n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                span[i] = i + 1;
            }   
            else{
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return span;
    }

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        
        for (int i = 0; i < n; i++) {
            span[i] = 1; // Minimum span is always 1 (the day itself)
            for (int j = i - 1; j >= 0 && prices[j] <= prices[i]; j--) {
                span[i]++;
            }
        }
        return span;
    }
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        //int[] span = calculateSpan(prices);
        int[] span = optimizedWay(prices);
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
