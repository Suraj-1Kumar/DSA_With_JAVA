package DSA.skills;

import java.util.*;

public class SumOfRectangle {
    // Row- col prefix sum Approach
    static int findSum3(int[][] matrix, int r1, int c1, int r2, int c2){
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        findPrefixSum(matrix);
        
        sum = matrix[r2][c2];
        if(r1 >= 1)
            up = matrix[r1-1][c2];

        if(c1 >= 1){
            left = matrix[r2][c1-1];
        }    
        if(r1 >= 1 && c1 >= 1){    
            leftUp = matrix[r1-1][c1-1];
        }

        ans = sum -  up - left + leftUp;

        return sum;
    }

    // Calculate row-wise & col-wise prefix sum
    // matrix[i][j] = sumRectangle( (0, 0), (i, j))
    static void findPrefixSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;     // if(r > 0)

        // travers horizonally to calculate row-wise prefix sum
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j ++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        // travers vertically to calculate col-wise prefix sum
        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    // Pre-Calculating the horizontal sum of each row
    static int findSum2(int[][] matrix, int r1, int c1, int r2, int c2){
        int sum = 0;

        findPrefixSumMatrix(matrix);

        for(int i = r1; i <= r2; i++){
            // r1 to r2 sum for row i
            if(c1 >= 1)
                sum += matrix[i][c2] - matrix[i][c1 - 1];
            else
                sum += matrix[i][c2];
        }
        return  sum;
    }

    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;     // if(r > 0)

        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j ++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }

    // Brute Force Approach
    static int findSum(int[][] matrix, int r1, int c1, int r2, int c2) {
        int sum = 0;
        for(int i = r1; i <= r2; i++){
            for(int j = c1; j <= c2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows & cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter " + r * c + " elements: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Finding sum of Rectangle
        System.out.println("Enter (r1, c1) & (r2, c2) :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        //System.out.println("Rectangle Sum: " + findSum(matrix, r1, c1, r2, c2));

        // Prefix Sum Apporach
        //System.out.println("Rectangle Sum: " +  findSum2(matrix, r1, c1, r2, c2));

        // Row-col prefix sum Approach
        System.out.println("Rectangle Sum: " +  findSum3(matrix, r1, c1, r2, c2));


        sc.close();
    }
}
