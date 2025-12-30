import java.util.Scanner;

public class InvertedTrianglePattern {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
	
		for(int i=1;i<=row;i++){                   //for(int i=row;i>=1;i--)
		    for(int j=1;j<=(row+1-i);j++){            //for(int j=1;j<=i;j++)
		        System.out.print("*");
		    }
		    System.out.println();
		}

		sc.close();
		
	}
}
