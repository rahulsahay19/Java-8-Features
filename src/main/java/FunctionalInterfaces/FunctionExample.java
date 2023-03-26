package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    //Input String
    //Output String
    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSome = (name) -> name.toUpperCase().concat(" Sahay");
    public static void main(String[] args) {
        System.out.println("Result is: " + function.apply("rahul"));
        System.out.println("Result of andThen is: " + function.andThen(addSome).apply("Rahul"));
        System.out.println("Result of andThen is: " + function.compose(addSome).apply("Rahul"));
    }
}
