package DSA.skills;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time{
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm;ss");
        System.out.println("Current Date and Time: " + now.format(formatter));
    }
}