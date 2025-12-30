package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class RemoveNullsFromAList {

    public static void main(String[] args){
        List<String> list1 = Arrays.asList(null,"Roopesh","Vimalesh","Kamalesh",null,"Vignesh");

        List<String> list2 = list1.stream()
                .filter(val1 -> val1 != null).toList();

        System.out.println(list2);
    }
}
