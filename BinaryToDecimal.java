import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary_num = sc.nextInt();
        int ans = 0;
        int pw = 1;      // 2 ^ 0 = 1 i.e Power of 2

        while(binary_num > 0){
            int digit = binary_num % 10;
            ans = ans + digit * pw;
            binary_num /= 10;
            pw = pw * 2;
        }
        System.out.println(ans);
    }
}
