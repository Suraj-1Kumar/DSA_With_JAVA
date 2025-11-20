class SurajException extends Exception{
    public SurajException(String str){
        super(str);
    }
}

public class ExceptionMake {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18 / i;
            if(j == 0) throw new SurajException("Don't want to print zero");
        }
        catch(SurajException e){
            j = 18 / 1;
            System.out.println("Default value");
        }
        catch(Exception e){
            System.out.println("Something went wrong. " + e);
        }
    }
}
