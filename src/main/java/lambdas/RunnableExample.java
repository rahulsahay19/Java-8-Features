package lambdas;

public class RunnableExample {

    public static void main(String[] args) {
        //This way we used to implement functional interface prior to Java 8
        //Basically creating anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable1!");
            }
        };
        //we basically run the runnable via thread
        new Thread(runnable).start();

        //Java 8 implementation
        //()->{}
        Runnable runnableLambda = () -> System.out.println("Inside runnable 2");
        new Thread(runnableLambda).start();
    }


}
