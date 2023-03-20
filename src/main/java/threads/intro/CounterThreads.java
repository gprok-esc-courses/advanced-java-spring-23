package threads.intro;

import java.util.ArrayList;
import java.util.Random;

public class CounterThreads extends Thread {

    private String name;

    public CounterThreads(String name) {
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

    public static void main(String[] args) {
        String [] names = {"A", "B", "C", "D", "E"};
        ArrayList<Thread> threads = new ArrayList<>();

        long startTime = System.nanoTime();
        for(String name : names) {
            CounterThreads counter = new CounterThreads(name);
            threads.add(counter);
            counter.start();
        }

        for(Thread thread : threads) {
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
