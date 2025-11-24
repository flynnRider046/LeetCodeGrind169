package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class RemoveNullsFromList {
    //remove null elements from the list
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,null,2,null,4);
        list1 = list1.stream().filter(val -> val != null).toList();
        System.out.println(list1);
    }

}
