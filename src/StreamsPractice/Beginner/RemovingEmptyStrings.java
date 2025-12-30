package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class RemovingEmptyStrings {

    public static void main(String[] args){
        List<String> list1 = Arrays.asList(
                "value1",
                "value2",
                "  ",
                "value3",
                ""
        );
        List<String> list2 = list1.stream()
                .filter(val1 -> !val1.isBlank())
                .toList();

        System.out.println(list2);
    }
}
