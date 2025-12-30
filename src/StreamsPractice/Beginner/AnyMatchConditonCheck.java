package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class AnyMatchConditonCheck {

    public static void main(String[] args){
        List<String> emails = Arrays.asList("rohithdamgeti@gmail.com","ksdhv@yahoo.com");

        boolean condition = emails.stream()
                .anyMatch(val1 -> val1.contains("@gmail.com"));

        System.out.println(condition);
    }
}
