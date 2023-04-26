package ProducerConsumer;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int max_int = 5;

        Thread t1 = new Thread(new Producer(list, max_int));
        Thread t2 = new Thread(new Consumer(list));

        t1.start();
        t2.start();
    }
}