package DSA.skills;

import java.util.ArrayList;
public class Wrapper {
    public static void main(String[] args) {
        //Wrapper classes
        Integer n = Integer.valueOf(3);
        System.out.println(n);

        Float f = Float.valueOf(4.6F);
        System.out.println(f);

        ArrayList <Integer> list1 = new ArrayList<>();

        // add new element
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(25);

        // get an element at index i
        System.out.println((list1.get(1)));

        // print with loop
        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // printing the array list directly
        System.out.println(list1);

        // Adding element at specific index
        list1.add(2, 30);
        System.out.println(list1);

        // modifying element at index i
        list1.set(2, 12);
        System.out.println(list1);

        // remove an element at index i
        list1.remove(2);
        System.out.println(list1);

        // removing an element e (return boolean type)
        list1.remove(Integer.valueOf(10));     // Doesn't give error if element is not present
        System.out.println(list1);

        // checking if an element exits
        boolean ans = list1.contains(Integer.valueOf(15));
        System.out.println(ans);

        // if we don't specify class, we can put anything
        ArrayList list2 = new ArrayList();
        list2.add("pqr");
        list2.add(5);
        list2.add(2.5f);
        System.out.println(list2);
    }
}
