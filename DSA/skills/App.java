package DSA.skills;

//import java.util.Scanner;

class Algebra {
    int a; 
    int b;

    Algebra(int x, int y){
        System.out.println("Constructor of algebra called");
        a  = x;
        b = y;
    
    }

    public int add(){
        return a + b;
    }

    public int subtract(){
        return a - b;
    }

    public int multiply(){
        return a * b;
    }

    public int divide(){
        return a / b;
    }

}

public class App{
    public static void main(String[] args) {
        Algebra obj = new Algebra(10, 5);
        System.out.println("Sum of input numbers is: ");
        int sum = obj.add();
        System.out.println(sum);

        int difference = obj.subtract();
        System.out.println("Difference of input numbers is: ");
        System.out.println(difference);


        
    }

    public int add(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
