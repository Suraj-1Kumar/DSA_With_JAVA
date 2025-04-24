import DSA.skills.*;


// App.java
/* public class SumOfTwoNumbers {
    public static void main(String[] args) {
      App obj = new App();
      int result = obj.add(5, 10);
      System.out.println("Sum of two numbers is: " + result);
    }
} */


// Access Modifier
public class Tester{
    public static void main(String[] args) {
      AccessModifier obj = new AccessModifier();
      System.out.println("Outside the package, inside main class: " + obj.str1);

      Tester1 obj1 = new Tester1();
      obj1.printFromChild();  
  }
}

class Tester1 extends AccessModifier{
  void printFromChild(){
    AccessModifier obj1  = new AccessModifier();
    System.out.println("Inside the package, inside child class: " + obj1.str1);
  }

}