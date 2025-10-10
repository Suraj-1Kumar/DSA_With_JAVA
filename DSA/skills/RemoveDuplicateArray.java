package DSA.skills;

public class RemoveDuplicateArray{
    public static void remove(int[] arr){
        int n = arr.length;
        int j = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[j]){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0; i <= j; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {24, 35, 35, 47,  47, 56, 58};

        remove(arr);
    }
}