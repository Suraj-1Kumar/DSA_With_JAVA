

class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In constructor block");
    }
}
public class StaticMagic{
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");     // Loads the class without object instantiated.
    }
}