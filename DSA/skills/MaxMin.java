package DSA.skills;

import java.util.Scanner;

public class MaxMin {
    static int secondMax(int[] arr, int n){
        if(n < 2){
            return -1;
        }
        
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        
        for(int num : arr){
            if(num > max){
                secMax = max;
                max = num;
            }
            else if(num < max && num > secMax){
                secMax = num;
            }
        }
        
        return secMax;
    }
    
    static int secondMin(int[] arr, int n){
        if(n < 2) return -1;
        
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        
        for(int num : arr){
            if(num < min){
                secMin = min;
                min = num;
            }
            else if(num > min && num < secMin){
                secMin = num;
            }
        }
        return secMin;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" No of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Second Max element: " + secondMax(arr, n));
        System.out.println("Second min element: " + secondMin(arr, n));
    }
}
