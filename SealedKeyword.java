sealed class A permits B,C{

}

final class B extends A{

}

final class C extends A{

}

class D{

}

public class SealedKeyword {
    public static void main(String[] args) {
        System.out.println("Sealed classes and interfaces in Java");
    }
}
