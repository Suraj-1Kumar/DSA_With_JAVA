package DSA.skills;

import java.util.*;

public class GCD {

    // LCM
    static int LCM(int x, int y){
        return (x*y)/gcd(x,y);
    }

    // Recursion or Euclid's algorithm
    static int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y, x % y);
    }

    // Long Division Apporach
    static int gcdLD(int x, int y){
        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    //Brute force Approach
    static int gcdBF(int num1, int num2) {
        for(int i = Math.min(num1, num2); i>=1; i--){
            if(num1 % i == 0 && num2 % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        // Using Brute Force Approach
        System.out.println("Brute Force Approach: \n" + gcdBF(num1, num2));

        // Using Long Division Approach
        System.out.println("Long Division Approach: \n" + gcdLD(num1, num2));

        // Using Euclid's Algorithm
        System.out.println("Euclid's Algorithm: \n" + gcd(num1, num2));

        // LCM
        System.out.println("LCM: \n" + LCM(num1, num2));
        sc.close();    
    }
}
