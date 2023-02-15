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

        // Print the contents of the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
