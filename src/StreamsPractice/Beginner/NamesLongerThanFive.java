package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class NamesLongerThanFive {

    public static void main(String[] varArgs){
        List<String> names = Arrays.asList("Pranay","Akshaya","Deekshitha","Kiran","Raasi");

        List<String> finalNames = names.stream()
                .filter(val1 -> val1.length() > 5)
                .toList();

        System.out.println(finalNames);
    }
}
