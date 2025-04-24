package DSA.skills;

import java.util.*;

public class SpiralOrder {

    static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements = 0;
        while(totalElements < r * c){
            // toprow -> leftcol to rightcol
            for(int j = leftCol; j <= rightCol && totalElements < r * c; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightcol -> toprow to bottomrow
            for(int i = topRow; i <= bottomRow && totalElements < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // bottomrow -> rightcol to leftcol
            for(int j = rightCol; j >= leftCol && totalElements < r * c; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftcol -> bottomrow to toprow
            for(int i = bottomRow; i >= topRow && totalElements < r * c; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    static void printmatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of rows & cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter " + r * c + " elements:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print inpur matrix
        System.out.println("Input Matrix:");
        printmatrix(matrix);

        // Spiral Matrix order
        System.out.println("Spiral Order:");
        printSpiralOrder(matrix, r, c);
        //printmatrix(matrix); 
 
        sc.close();
    }
}
