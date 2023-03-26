package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Adam", "Jenny", "Rahul", "Mike", "Eric");
        //prior java 8 way
        Collections.sort(stringList);
        System.out.println("Sorted List: " +stringList);

        //Java 8 Way
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted List using java8: " +stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Reversed List using java8: " +stringList);
    }
}
