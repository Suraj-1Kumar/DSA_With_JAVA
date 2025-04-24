package DSA.skills;

public class AccessModifier {
    public String str1 = "I am a public member";

    void printFromClass() {
        System.out.println("Within class: " + str1);
    }

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.printFromClass();
        System.out.println(obj.str1);

        App1 obj2 = new App1();
        obj2.printFromOutsideClass();
    }
}

// App is not public anymore (default access)
class App1 {
    void printFromOutsideClass() {
        AccessModifier obj2 = new AccessModifier();
        System.out.println("Within class App: " + obj2.str1);
    }
}
