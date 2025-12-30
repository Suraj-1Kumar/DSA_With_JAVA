import java.util.*;
public class Factoial {
    
    static void factorial(int num){
        int fact = 1;
        while(num > 0){
            fact *= num;
            num--;
        }
        System.out.println("The factorial  is: " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        //function calling
        factorial(num);

        sc.close();
    }
}
