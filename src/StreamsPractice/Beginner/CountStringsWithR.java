package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class CountStringsWithR {

    public static void main(String[] args){
        List<String> list1 = Arrays.asList("Nani","Prabhas","NTR","Vishwak","nagarjuna","Venkatesh");

        int noWithR = (int) list1.stream()
                .map(val1 -> val1.toLowerCase())
                .filter(val1 -> val1.startsWith("n"))
                .count();

        System.out.println(noWithR);
    }
}
