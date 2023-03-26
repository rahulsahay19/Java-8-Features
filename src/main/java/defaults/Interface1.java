package defaults;

public interface Interface1 {
    default void MethodA(){
        System.out.println("Inside Method A" + Interface1.class);
    }
}
