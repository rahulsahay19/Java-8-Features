package lambdas;

import java.util.Comparator;

public class ComaratorLambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 --> o1 == 02. 1--> 01>o2, -1 --> o1<o2
            }
        };
        System.out.println("Legacy way Result:" + comparator.compare(4, 3));
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };
        System.out.println("Lambda way Result:" + comparatorLambda.compare(3, 4));
    }
}
