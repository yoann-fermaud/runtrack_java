package jour4.job02;

public class RunnableInterfaceTest {
    public static void main(String[] args) {
        RunnableInterface runnableInterface = new RunnableInterface();
        Thread thread = new Thread(runnableInterface);
        thread.start();
    }
}
