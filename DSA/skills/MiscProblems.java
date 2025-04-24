package DSA.skills;

public class MiscProblems {
    static void reverse(int[] arr, int i, int j){
        while(i < j){
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInplace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int j = 0;
        int[] ans = new int[n];

        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }

        for(int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void swapNum(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping the numbers " + "a = " + a + " b = " + b);
    }

    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] reversedArray = new int[n];
        int j = 0;
        for(int i = n - 1; i >= 0; i--) {
            reversedArray[j++] = arr[i];
        }
        /*int i = n - 1; j = 0;
        while(i >= 0){
            reversedArray[j++] = arr[i--];
        }   */
        return reversedArray;
    }   


    static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArrayInplace(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }
    
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int[] arr = {1,2,3,4,5};

        /*swapNum(a, b);
        int[] reversedArray = reverseArray(arr);
        printArray(reversedArray); 
        reverseArrayInplace(arr);
        printArray(arr);  

        //Rotate array using extra space
        int k = 3;
        int[] ans = rotateArray(arr, k);
        printArray(ans);  */

        //Rotate array in place
        int k = 3;
        rotateInplace(arr, k);
        printArray(arr);
        
    }
}
