package DSA.skills;

import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();
        int[] array =  new int[size];

        System.out.print("Enter " + size + " elements: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        
        //Print array
        for(int i = 0; i< size; i++){
            System.out.print(array[i] + " ");
        }
    }
}
