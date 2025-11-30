package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountStringsWithCharecter {

    static int countingStrings(List<String> list1){
        if(list1.isEmpty()){
            return 0;
        }
        Long num = list1.stream().filter(s -> s.startsWith("N")).count();
        return Math.toIntExact(num);
    }

    /*
    Solution to find out the count of strings that are starting
    with a specific character 'N'
     */
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Nani","Nagarjuna","Venkatesh","Chiranjeevi","NTR","Prabhas");
        System.out.println(countingStrings(list1));

    }
}
