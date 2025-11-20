import java.util.ArrayList;

public class varKeyword {
    public static void main(String[] args) {
        var name = "Java"; // Compiler infers 'name' as String
        var version = 10; // Compiler infers 'version' as int

        var list = new ArrayList<String>(); // Compiler infers 'list' as ArrayList<String>
        list.add("Alice");
        list.add("Bob");
        for (var person : list) { // Compiler infers 'person' as String
            System.out.println(person + " is using " + name + " version " + version);
        }

        var nums = new int[5];
        for(var i = 0; i < nums.length; i++) {
            nums[i] = i * 2;
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
    }
}
