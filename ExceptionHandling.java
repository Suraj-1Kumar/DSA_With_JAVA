

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }
        catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero.");
            System.err.println("Exception message: " + e.getMessage());
        } finally {
            System.err.println("This finally block always executes.");
        }
        System.out.println(j);
    }
}
