package DSA.skills;

import java.util.Scanner;

public class Matrix {
    // Multiplication of Matrix
    static void multiplyMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        int[][] mul = new int[r1][c2];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    /*
                     mul[i][j] = ith row of a * jth col of b
                    */
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printMatrix(mul);
    }

    // Sum of two matrices
    static void addMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition not possible");
            return;
        }

        int[][] sum = new int[r1][c1];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }

    //  Print Matrix
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
        System.out.print("Enter the number of rows r1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns c1: ");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter first matrix elements");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(arr1);

        System.out.print("Enter the number of rows r2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns c2: ");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter second matrix elements");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 2");
        printMatrix(arr2);
        
        System.out.println("The sum matrix is: ");
        addMatrix(arr1, r1, c1, arr2, r2, c2);

        System.out.println("Multiplication matrix is:");
        multiplyMatrix(arr1, r1, c1, arr2, r2, c2);

        sc.close();
    }
}


