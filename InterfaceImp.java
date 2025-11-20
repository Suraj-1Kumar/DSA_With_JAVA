// class -  class -> extends
// interface - class -> implements
// interface - interface -> extends


interface Computer{
    void code();
}

interface x extends Computer{
    void code();
}

class Laptop implements x{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop implements x{
    public void code(){
        System.out.println("code, compile, run : fast");
    }
}


class Developer{
    public void devApp(Computer obj){
        obj.code();
    }
}

public class InterfaceImp {
    public static void main(String[] args) {
        Computer lap = new Laptop();

        Computer desk = new Desktop();

        Developer suraj = new Developer();
        suraj.devApp(lap);
        suraj.devApp(desk);
    }
}
