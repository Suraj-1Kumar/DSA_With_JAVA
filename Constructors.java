class A{
    public A(){
        super();
        System.out.println("in constructor A");
    }

    public A(int n){
        super();
        System.out.println("in constructor A int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in constructor B");
    }

    public B(int n){
        this();
        System.out.println("in constructor B int");
    }
}

public class Constructors {
    public static void main(String[] args) {
        B obj = new B(5);
        
    }
}
