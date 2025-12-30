package DSA.skills;

import java.util.*;
class ArrayDemo{
    void returnIndex(int a){
        int[] arr = {1, 2, 3, 4, 5};
        //int x;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

    void maxNum(){
        int[] arr = {1, 2, 3, 4, 5};
        int max = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                
            }
        }
        System.out.println("Max value: " + max);
    }

    void sum(){
        int[] scores = {87, 78, 81, 87, 84};
        int total_score = 0;
        for(int i=0;i<scores.length;i++){
            total_score += scores[i];
        }
        System.out.println(total_score);
    }

    void multiArray(){
        //int[][] arr = new int[3][3];
        int[][] arr1 = {{1, 2}, {3, 4}, {5, 6}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
    void arrayDemo(){
        // 1-D array
        int[] ages = new int[3];

        ages[0] = 16;
        ages[1] = 20;
        ages[2] = 25;

        // For loop
        for(int i=0;i<ages.length;i++){
            System.out.println(ages[i]);
        }    

        //For each loop
        for(int age : ages){
            System.out.println(age);
        }

        //while loop
        int i = 0;
        while(i < ages.length){
            System.out.println(ages[i]);
            i++;
        }
    }
}

public class Arrays {
    public static void main(String[] args) {
        ArrayDemo ad = new ArrayDemo();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        //ad.arrayDemo();
        //ad.multiArray();
        //ad.sum();
        //ad.maxNum();
        ad.returnIndex(choice);

        sc.close();
    }
}
