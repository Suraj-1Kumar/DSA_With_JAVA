package DSA.skills.Stacks;

import java.util.Stack;

public class CelebrityProblem {
    public static int findCelebrity(int[][] matrix, int n) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (matrix[a][b] == 1) {
                // a knows b, so a cannot be celebrity
                st.push(b);
            } else {
                // a does not know b, so b cannot be celebrity
                st.push(a);
            }
        }

        int candidate = st.pop();

        // Verify candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (matrix[candidate][i] == 1 || matrix[i][candidate] == 0) {
                    return -1; // No celebrity
                }
            }
        }

        return candidate; // Celebrity found
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0}
        };
        int n = matrix.length;
        int celebrity = findCelebrity(matrix, n);
        if (celebrity == -1) {
            System.out.println("No celebrity found");
        } else {
            System.out.println("Celebrity is at index: " + celebrity);
        }
    }
}
