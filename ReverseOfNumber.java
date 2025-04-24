import java.util.*;
public class ReverseOfNumber {

    public static void reverse(int n){
        int reversed = 0;
        while( n != 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Function calling
        System.out.println("Reverse of the number is: ");
        reverse(num);
    }
}
