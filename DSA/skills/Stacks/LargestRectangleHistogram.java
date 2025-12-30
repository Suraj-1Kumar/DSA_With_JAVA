package DSA.skills.Stacks;

import java.util.Stack;

public class LargestRectangleHistogram {
    public static int largestRectangle(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        //left smaller elements
        for(int i = 0; i < n; i++){
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        while(!st.isEmpty()) st.pop();

        //right smaller elements
        for(int i = n-1; i >= 0; i--){
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        //calculate area
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            int height = heights[i];
            int widht = right[i] - left[i] - 1;
            int area = height * widht;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println("Largest Rectangle Area: " + largestRectangle(heights));
    }
}
