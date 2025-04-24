package DSA.skills;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProblems {

    static void reverseList(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;
        while( left < right){
            int temp = Integer.valueOf(list.get(left));
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original Lits " + list);
        //reverseList(list);
        Collections.reverse(list);
        System.out.println("Reversed List " + list);
        // Sort 
        Collections.sort(list);
        System.out.println("Ascending Order " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order " + list);


        // string Arraylist
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Welcome");
        strList.add("To");
        strList.add("Java");
        strList.add("Programming");

        System.out.println("Original list " + strList);
        Collections.sort(strList);
        System.out.println("Alphabetical Order " + strList);
    }
}
