package DSA.skills;

import java.util.*;

public class Recursion {
    static int power(int p, int q){
        if(q == 0) return 1;
        int smallAns = power(p, q/2);
        if( q % 2 == 0){
            return smallAns * smallAns;
        }
        else{
            return p * smallAns * smallAns;
        }
    }

    static int pow(int p, int q){
        if(q == 0){
            return 1;
        }
        return p * pow(p, q-1);
    }

    static int countDigits(int n){
        if(n == 0 ){
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    static int sumOfDigit(int n){
        if(n >= 0 && n <= 9){
            return n;
        }

        return sumOfDigit(n / 10) + n % 10;
    }

    static int fibonacci(int n){
        if(n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int factorial(int n) {
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    static void pD(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        pD(n-1);
    }

     static void pI(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        pI(n-1);
        System.out.println(n);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        System.out.println("Increasing order");
        pI(n);
        System.out.println("Decreasing order");
        pD(n);

        //Factorial
        System.out.println("Factorial of " + n + " is " + factorial(n)); 

        // Fibonacci
        for(int i = 0; i <= n; i++){
            System.out.println(fibonacci(i));
        } 

        // sum of digits of numbers
        System.out.println(sumOfDigit(n));

        // Count digits
        System.out.println(countDigits(n));

        // p ^ q
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(pow(p, q));

        System.out.println(power(p, q));

        sc.close();
    }
}
