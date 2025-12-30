package DSA.skills;

import java.util.Scanner;
public class MultiDimArray {

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
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
        printArray(sum);
    }

    static void printArray(int[][] arr){
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

        System.out.println("Enter " + r*c + " elements");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input array is:");
        printArray(arr);

        sc.close();

    }
}
