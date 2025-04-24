import java.util.*;
public class RaisePower {

    static void raisePower(int base, int power){
        int result = 1;
        for(int i=1;i<=power;i++){
            result = result * base;
        }
        System.out.println("The result is: "+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();

        //Function calling
        raisePower(base, power);
    }
}
