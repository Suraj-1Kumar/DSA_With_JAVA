package DSA.skills;

import java.util.*;

public class LinearSearchRec {
    // Retun all indices in an ArrayList 
    static ArrayList<Integer> allIndices(int[] arr, int target, int idx){
        if(idx >= arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(arr, target, idx+1);
        ans.addAll(smallAns);
        return ans;
    }


    // find all indices of target
    static void findIndices(int[] arr, int target, int idx){
        if(idx == arr.length) return; 

        if(arr[idx] == target) {
            System.out.println(idx);
        }

        findIndices(arr, target, idx + 1);
    }

    // find first index
    static int findIndex(int[] arr, int target, int idx){
        if(idx == arr.length) return -1;

        if(arr[idx] == target) return idx;

        return findIndex(arr, target, idx+1);
    }

    // Return true if target is present
    static boolean linearSearch(int[] arr, int target, int idx){
        if(idx >= arr.length)  return false;
        
        if(arr[idx] == target) return true;

        return linearSearch(arr, target, idx+1);
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 6, 8, 6, 5};
        int target = sc.nextInt();
        if(linearSearch(arr, target, 0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        // Return index 
        System.out.println("Index is: " + findIndex(arr, target, 0));

        // Find all indices
        System.out.println("All indices of target:");
        findIndices(arr, target, 0);

        // Return indcies using Arraylist
        ArrayList<Integer> indices = allIndices(arr, target, 0);
        for(Integer i : indices){
            System.out.println(i);
        }

        sc.close();
    }
}
