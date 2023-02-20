package task4;

public class Task4 {
    public static void main() {
        MyExecutor executor = new MyExecutor(5);

        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); //hard time-consuming operations

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        while (!Thread.currentThread().isInterrupted() && executor.getQueue().size() > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("All tasks completed");
        executor.shutdown();
    }
}