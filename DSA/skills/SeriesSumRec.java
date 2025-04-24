package DSA.skills;

import java.util.*;

public class SeriesSumRec {

    static int seriesSum(int n){
        if(n == 0) return 0;

        if(n % 2 == 0) return seriesSum(n - 1) - n;
        else return n + seriesSum(n - 1);
    }

    static int seriesSum1(int n){
        if(n == 0) return 0;
        return n + seriesSum1(n-1);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(seriesSum1(n));

        System.out.println(seriesSum(n));

        sc.close();
    }
}
