package defaults;

public interface Interface2 extends Interface1 {
    default void MethodB(){
        System.out.println("Inside Method B");
    }
    default void MethodA(){
        System.out.println("Inside Method A: " + Interface2.class);
    }
}
