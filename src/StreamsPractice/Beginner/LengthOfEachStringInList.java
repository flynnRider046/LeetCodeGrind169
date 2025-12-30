package StreamsPractice.Beginner;

import java.util.List;

public class LengthOfEachStringInList {

    public static void main(String[] args) {
        List<String> list1 = List.of("Praneetha","SaiKishore","Rohith");

        List<Integer> list2 = list1.stream()
                .map(val1 -> val1.length()).toList();

        System.out.println(list2);
    }
}
