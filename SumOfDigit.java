import java.util.*;
public class SumOfDigit {
    public static void sumOfDigit(int num){
        int sum = 0;
        int digit;
        while(num > 0){
            digit = num % 10;
            num = num / 10;
            sum+=digit;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        //Function calling
        sumOfDigit(num);

        sc.close();
    }
}

