@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
    public void config(int i);
}
public class Lambda {
    public static void main(String[] args) {
        A obj = () -> System.out.println("in show");
    
        obj.show();  
        
        B obj1 = i -> System.out.println("in config " + i);
        obj1.config(5);
    }
}
