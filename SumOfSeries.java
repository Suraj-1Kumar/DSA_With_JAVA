import java.util.*;
public class SumOfSeries {

    static void sumOfSeries(int num){
        int sum = 0;
        for(int i=1;i<=num;i++){
            if(i % 2 == 0){
                sum -= i;
            }
            else{
                sum += i;
            }
        }
        System.out.println("The sum of the series is: "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Function calling
        sumOfSeries(num);
    }
}
