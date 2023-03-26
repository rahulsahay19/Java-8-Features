package defaults;

public class Client123 implements Interface1, Interface2, Interface3{
    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.MethodA(); //resolve to the child implementation
        client123.MethodB();
        client123.MethodC();
    }
}
