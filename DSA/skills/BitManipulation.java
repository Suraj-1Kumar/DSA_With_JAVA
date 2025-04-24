package DSA.skills;
import java.util.*;

public class BitManipulation {

    // Return the position of set bit
    static int setBitPosition(int n) 
    {
        if(n == 0 || (n & (n-1)) != 0){
            return -1;
        }
        int pos = 0;
        while((n & 1) == 0){
            n = n >> 1;
            pos++;
        }
        return pos;
    }

    // Count the number of 1s in binary
    static int countOnes(int num){
        int count = 0;
        while(num > 0){
            num = num & (num - 1);
            count++;
        }
        return count;
    }

    // Flip (0 -> 1; 1 -> 0)
    static int toggleBit(int num, int i){
        return num ^ (1 << i);
    }

    // clear ith or in a range of bit
    static int clearBit(int num, int i){
        return num & ~(1 << i);
    }

    // set ith bit
    static int setBit(int num, int i){
        return num | (1 << i);
    }


    // Return ith bit
    static int getBit(int num, int i){
        //return (num >> i) & 1;
        int mask = (1 << i);
        return (num & mask) > 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();

        System.out.println("Get bit: " + getBit(num, i));

        System.out.println("Set bit: " + setBit(num, i));

        System.out.println("clear bit: " + clearBit(num, i));

        System.out.println("Toggle bit: " + toggleBit(num, i));

        System.out.println("Count 1s: " + countOnes(num));

        System.out.println("Set bit position: " + setBitPosition(num));

        sc.close();
    }
}
