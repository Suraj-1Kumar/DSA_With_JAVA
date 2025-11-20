import java.util.*;

class Student implements Comparable<Student>
{
    int age;
    String name;

    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that){
        if(this.age > that.age){
            return 1;
        }
        else return -1;
    }
}
public class CollectionsDemo {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i % 10 > j % 10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(29);
        nums.add(72);
        nums.add(31);
        nums.add(43);

        Collections.sort(nums, com);
        System.out.println(nums);

        Comparator<Student> comm = new Comparator<Student>(){
            public int compare(Student i, Student j){
                if(i.age > j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(25, "Bob"));
        studs.add(new Student(18, "Alice"));

        Collections.sort(studs);
        for(Student s : studs){
            System.out.println(s);
        }
    }
}
