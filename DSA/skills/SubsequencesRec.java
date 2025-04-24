package DSA.skills;
import java.util.*;

public class SubsequencesRec {
    static void printSSQ(String str, String currAns){
        if(str.length() == 0){
            System.out.println(currAns);
            return;
        }

        char curr = str.charAt(0);
        String remString = str.substring(1);

        printSSQ(remString, currAns + curr);
        printSSQ(remString, currAns);
    }

    static ArrayList<String> getSSQ(String str){
        ArrayList<String> ans = new ArrayList<>();

        // Base case
        if(str.length() == 0){
            ans.add("");
            return ans;
        }     

        char curr = str.charAt(0);
        // Recursive or subproblem
        ArrayList<String> smallAns = getSSQ(str.substring(1));

        // Self work
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        ArrayList<String> ans = getSSQ(str);
        for(String ss : ans){
            System.out.println(ss);
        } 

        System.out.println("Void method ans: ");
        printSSQ(str, "");

        sc.close();
    }
}
