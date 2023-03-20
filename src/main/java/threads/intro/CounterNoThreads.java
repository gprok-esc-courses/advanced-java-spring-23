package threads.intro;

import java.util.Random;

public class CounterNoThreads {

    private String name;

    public CounterNoThreads(String name) {
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

    public static void main(String[] args) {
        String [] names = {"A", "B", "C", "D", "E"};

        long startTime = System.nanoTime();
        for(String name : names) {
            CounterNoThreads counter = new CounterNoThreads(name);
            counter.count();
        }
        long endTime = System.nanoTime();

        System.out.println("DONE!");
        System.out.println("Time to completion: " + (endTime - startTime));
    }

}
