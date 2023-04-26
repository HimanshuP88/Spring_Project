import java.util.concurrent.locks.ReentrantLock;
public class ReenterantLockExample {
    private static ReentrantLock lock =new ReentrantLock();

    public static void main(String [] args){
        new Thread(new Runnable){

            @Override
            public void run() {
                doSomeThing();
            }}.start();
}

        }



