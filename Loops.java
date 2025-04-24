import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	   // for(int i=5;i<=num;i++){
	   //     if(i%5==0 && i%7==0){
	   //         System.out.print(i);
	   //         break;
	   //     }
	   // }
	   
	   myloop: for(int n=1;n<=num;n++){
	       if(n%3==0){
	           continue myloop;
	       }
	       System.out.println(n);
	   }
	   //int n = 1;
	   //while(n<=num){
	       
	   //    if(n%3==0){
	   //        n++;
	   //        continue;
	   //    }
	   //    System.out.println(n);
	   //    n++;
	   //}
	}
}
