enum Status{
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Running;
        Status[] ss = Status.values();

        for(Status i : ss){
            System.out.println(i + " : " + s.ordinal());
        }
        System.out.println(s);
        System.out.println(s.ordinal());
    }
}
