package DSA.skills;

import java.util.Scanner;

public class K_Multiples {
    static void printMultiples(int num, int k){
        if(k == 1){
            System.out.println(num);
            return;
        }
        printMultiples(num, k-1);
        System.out.println(num * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the multiple : ");
        int k = sc.nextInt();

        // Method calling
        printMultiples(num, k);

        sc.close();
    }
}
