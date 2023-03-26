package methodreference;

import java.util.function.Function;

public class FuncMethodReference {
    static Function<String, String> toUpperCaseLambda = (s) ->s.toUpperCase();
    static Function<String, String> toUpperCaseMethod = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("Rahul"));
        System.out.println(toUpperCaseMethod.apply("Rahul"));
    }
}
