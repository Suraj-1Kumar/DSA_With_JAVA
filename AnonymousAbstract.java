abstract class A{
    public abstract void show();
    public abstract void config();
}
public class AnonymousAbstract {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show(){
                System.out.println("in new show");
            }

            public void config(){
                System.out.println("in new config");
            }
        };

        obj.show();
        obj.config();
    }
}
