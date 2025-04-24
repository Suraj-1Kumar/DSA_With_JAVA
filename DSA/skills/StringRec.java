package DSA.skills;

import java.util.*;

public class StringRec {
    

    static void Palindrome(String str){
        String rev = reverseString(str, 0);

        if(rev.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    static String reverseString(String str, int idx){
        if(idx == str.length()) return "";
        
        return  reverseString(str, idx+1) + str.charAt(idx);
    }

    static String removeA(String str){
        if(str.length() == 0) return "";

        String smallAns = removeA(str.substring(1));
        char currChar = str.charAt(0);
        if(currChar != 'a'){
            return currChar + smallAns;
        }
        else{
            return smallAns;
        }
    }

    static String remove(String str, int idx){
        if(idx == str.length()) return "";

        String smallAns = remove(str, idx+1);

        char currChar = str.charAt(idx);
        if(currChar != 'a'){
            return currChar + smallAns;
        }
        else{
            return smallAns;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        //System.out.println("After removing A: " + remove(str, 0)); 
        System.out.println(removeA(str));

        System.out.println("Reverse of String: "+ reverseString(str, 0));  
        
        Palindrome(str);

        

        sc.close();
    }
    

}
