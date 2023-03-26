package streams;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
    public static int findMaxValue(List<Integer> integerList){
       return integerList.stream()
                .reduce(0, (x,y)->x>y?x:y);
    }

    public static Optional<Integer> findValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((x, y) ->x>y?x:y);
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();//Arrays.asList(6, 7, 8, 9, 10);
        int maxValue = findMaxValue(integerList);
        System.out.println(maxValue);
        System.out.println("Optional way");
        Optional<Integer> maxValueOptional = findValueOptional(integerList);
        if(maxValueOptional.isPresent()){
            System.out.println(maxValueOptional.get());
        }else{
            System.out.println("List is empty");
        }
    }
}
