package task4;

import java.util.concurrent.*;

public class MyExecutor {

    private final int numThreads;
    private final BlockingQueue<Runnable> workQueue;
    private final Thread[] threads;
    private volatile boolean shouldShutdown = false;


    public MyExecutor(int numThreads) {
        this.numThreads = numThreads;
        this.workQueue = new LinkedBlockingQueue<>();
        this.threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new WorkerThread();
            threads[i].start();
        }
    }

    public void execute(Runnable task) {
        try {
            workQueue.put(task);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdown() {
        shouldShutdown = true;
        for (Thread thread : threads) {
            thread.interrupt();
        }
    }

    public BlockingQueue<Runnable> getQueue() {
        return workQueue;
    }

    private class WorkerThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Runnable task = workQueue.take();
                    task.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}