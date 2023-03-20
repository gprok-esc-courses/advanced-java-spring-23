package threads.intro;

import java.util.ArrayList;
import java.util.Random;

public class CounterRunnable implements Runnable {
    private String name;
    private Thread thread;

    public CounterRunnable(String name) {
        this.name = name;
    }

    public void count() {
        Random rnd = new Random();
        for(int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(rnd.nextInt(5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        count();
    }

    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    public static void main(String[] args) {
        String [] names = {"A", "B", "C", "D", "E"};
        ArrayList<CounterRunnable> threads = new ArrayList<>();

        long startTime = System.nanoTime();
        for(String name : names) {
            CounterRunnable counter = new CounterRunnable(name);
            threads.add(counter);
            counter.start();
        }

        for(CounterRunnable thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long endTime = System.nanoTime();

        System.out.println("DONE!");
        System.out.println("Time to completion: " + (endTime - startTime));
    }
}
