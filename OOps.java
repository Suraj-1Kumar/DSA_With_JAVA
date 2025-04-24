class Student {
    int RollNo;

    String Name;
}


public class OOps {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.RollNo = 1;
        obj1.Name = "Rohan";
        System.out.println(obj1.RollNo);
        System.out.println(obj1.Name);

        Student obj2 = new Student();
        obj2.RollNo = 2;
        obj2.Name = "Sohan";
        System.out.println(obj2.RollNo);
        System.out.println(obj2.Name);
    }
}
