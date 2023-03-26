package defaults;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> integerList);

    //From java 8, it's possible
    //Default methods can be overridden
    default int size(List<Integer> integerList){
        System.out.println("Inside Multiplier interface");
        return integerList.size();
    }

    //Static methods can't be overridden
    static boolean isFilled(List<Integer> integerList){
        return integerList!=null && integerList.size()>=0;
    }
}
