package ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,3,4,4,5,5,6,6,6,6);

        //Imperative way
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer integer: intList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println("Unique List:" + uniqueList);
        //Declarative way
        List<Integer> collect = intList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique List:" + collect);
    }

}
