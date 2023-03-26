package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CollectionsVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        names.remove(0);
        System.out.println(names);

        //Streams doesn't allow add, modify or remove elements
        names.stream();
        System.out.println(names.stream().collect(Collectors.toList()));

    }
}
