package DSA.skills.Backtracking;

public class StringPemutation {
    public static void permute(String str, String perm, int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permute(newStr, perm + curr, idx + 1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";

        permute(str, "", 0);
    }
}
