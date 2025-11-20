public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j == 0){
                throw new ArithmeticException("Don't want to print zero");
            }
        }
        catch(ArithmeticException e){
            j = 18 / 1;
            System.out.println("Default value");
        }
        catch(Exception e){
            System.out.println("Something went wrong. " + e);
        }

        System.out.println(j);
    }
}
