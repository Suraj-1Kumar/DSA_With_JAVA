package DSA.skills;

class Student{
    String name;
    int age;
}

public class PassByValue_Reference {
    // Pass by Reference
    static void changeName(Student s){
        s.name = "Alice";
    }

    // Pass by Value
    static void changeAge(int a){
        a = 25;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Pass by Reference: ");
        s.name = "Bob";             //Pass by Reference
        System.out.println("Before change: " + s.name);
        changeName(s);
        System.out.println("After changing: "+ s.name);

        System.out.println("Pass by Value: ");
        int age = 20;              // Pass by value
        System.out.println("Before change: " + age);
        changeAge(age);
        System.out.println("After changing: "+ age);
    }
}
