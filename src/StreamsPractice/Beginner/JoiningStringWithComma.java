package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStringWithComma {

    public static void main(String[] args){
        List<String> list1 = Arrays.asList(
                "Rohith",
                "Alice",
                "",
                "Bob",
                null,
                "Charlie",
                "David",
                "",
                "Eve"
        );

        String fiVal = list1.stream()
                .filter(val1 -> val1 != null && !val1.isBlank())
                .collect(Collectors.joining(","));

        System.out.println(fiVal);
    }
}
