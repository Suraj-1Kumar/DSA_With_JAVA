package DSA.skills;

import java.util.*;

public class StringPalindrome {
    static boolean isPalindrome(String str, int l, int r){
        if(l >= r) return true;
        return (str.charAt(l) == str.charAt(r) && isPalindrome(str, l+1, r-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str, 0, str.length()-1));

        sc.close();
    }
}
