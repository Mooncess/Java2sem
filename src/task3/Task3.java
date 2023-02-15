package task3;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Task3 {
    public static void main() throws InterruptedException {
        SemaphoredList<Integer> list = new SemaphoredList<>(new ArrayList<>(), new Semaphore(1));

        // Create a bunch of threads that add and remove elements from the list
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Random random = new Random();
                try {
                    // Add a random integer to the list
                    list.add(random.nextInt(100));
                    System.out.println("added smth");

                    // Sleep for a bit
                    Thread.sleep(random.nextInt(100));

                    // Remove an element from the list
                    list.remove(random.nextInt(list.size()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        // Wait for all threads to finish
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("printing list");
        // Print the contents of the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        SynchronizedMap<String,Integer> safemap = new SynchronizedMap<String,Integer>();

        for(int i=0;i<10;i++){
            new Thread(()->{
                Random random = new Random();
                try {
                    // Add a random integer to the list
                    Integer rand = random.nextInt(100);
                    safemap.put(rand.toString(),rand);
                    System.out.println("added smth:" + safemap.get(rand.toString()));


                    // Sleep for a bit
                    Thread.sleep(random.nextInt(100));

                    // Remove an element from the list
                    safemap.remove(rand.toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("printing size of map");
        System.out.println(safemap.size());
    }
}
