package DSA.skills;

import java.util.*;

public class GenerateSpiralMatrix {

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int curr = 1;
        int topRow = 0, bottomRow = n - 1;
        int leftCol = 0, rightCol = n - 1;
        
        while(curr <= n * n){
            // topRow -> leftCol to rigthCol
            for(int j = leftCol; j <= rightCol && curr <= n*n; j++){
                matrix[topRow][j] = curr++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && curr < n*n; i++) {
                matrix[i][rightCol] = curr++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for(int j = rightCol; j >= leftCol && curr < n*n; j--){
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for(int i = bottomRow; i >= topRow && curr < n*n; i--){
                matrix[i][leftCol] = curr++;
            }
            leftCol++;
        }
        return matrix;
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
        System.out.println("Enter order of Spiral matrix: ");
        int n = sc.nextInt();

        int[][] matrix =  generateMatrix(n);
        System.out.println("Spiral matrix of order " + n*n + " is:");
        printMatrix(matrix);

        sc.close();
    }
}
