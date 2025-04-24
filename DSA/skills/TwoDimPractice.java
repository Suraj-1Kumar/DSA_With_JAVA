package DSA.skills;

import java.util.*;
public class TwoDimPractice
{   
    static void transposeMatrix(int[][] arr, int r, int c){
        int[][] ans = new int[c][r];

        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){ 
                ans[i][j] = arr[j][i];
            }    
        }
        printMatrix(ans);
    }

    // Inplace Transpose
    static void transposeMatrixInplace(int[][] arr, int r, int c) {
        for(int  i = 0; i < c; i++){
            for(int j = i; j < r; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printMatrix(arr);
    }
    
    static void reverse(int[][] arr, int r, int c){
        int[][] ans = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = arr[i][c - j - 1];
            }
        }
        printMatrix(ans);
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
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter matrix elements");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix is");
        printMatrix(arr);
        
        /*System.out.println("Reversed Matrix");
        reverse(arr, r, c); */

        System.out.println("Transpose Matrix");
        transposeMatrix(arr, r, c);

        System.out.println("\nInplace Transpose Matrix");
        transposeMatrixInplace(arr, r, c);
        sc.close();
	}
}