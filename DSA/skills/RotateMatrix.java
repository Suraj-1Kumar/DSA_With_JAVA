package DSA.skills;

import java.util.Scanner;

public class RotateMatrix {
    //Rotate the matrix by 90 degrees clockwise
    static void rotateMatrix(int[][] matrix, int n){
        // Transpose
        transposeMatrixInplace(matrix, n, n);

        // Reverse each row 
        for(int i = 0; i < n; i++){
            reverseRow(matrix[i]);
        }
    }

    static void transposeMatrixInplace(int[][] arr, int r, int c) {
        for(int  i = 0; i < c; i++){
            for(int j = i; j < r; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Reverse Particular Row of Matrix
    static void reverseRow(int[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void printMatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){           // row number
            for(int j = 0;  j < arr[i].length; j++){   // column number
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of cols:");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix elements");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix is");
        printMatrix(matrix);

        System.out.println("Rotated Matrix");
        rotateMatrix(matrix, r);
        printMatrix(matrix);

        sc.close();
    }    
}
