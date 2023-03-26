package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> number = (i)->{
        return i%2==0;
    };
    static Predicate<Integer> p1 = (i) -> i%2==0;
    static Predicate<Integer> p2 = (i) -> i%5==0;

    public static void predicateAnd(){
        //Predicate chaining
        System.out.println(p1.and(p2).test(10));
    }
    public static void predicateOr(){
        //Predicate chaining
        System.out.println(p1.or(p2).test(8));
    }
    public static void main(String[] args) {

        System.out.println(number.test(4));
        predicateAnd();
    }
}
