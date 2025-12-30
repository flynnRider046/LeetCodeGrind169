package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringsToUpperCase {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("rohith","ramesh","ramani");
        List<String> list2 = list1.stream()
                .map(val1 -> val1.toUpperCase()).toList();

        System.out.println(list2);
    }
}
