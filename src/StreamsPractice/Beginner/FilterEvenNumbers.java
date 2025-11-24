package StreamsPractice.Beginner;

import java.util.*;

//Program to filter even numbers form the list
public class FilterEvenNumbers {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNumbers = list1.stream().filter(num -> num%2 == 0).toList();

        System.out.println(evenNumbers);

    }



}
