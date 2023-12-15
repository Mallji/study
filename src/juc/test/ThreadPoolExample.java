package juc.test;

import java.util.concurrent.*;

public class ThreadPoolExample {

    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with a fixed-size pool of 3 threads
        ExecutorService executor = new ThreadPoolExecutor(
                3,  // corePoolSize
                3,  // maximumPoolSize
                0L, // keepAliveTime
                TimeUnit.MILLISECONDS, // unit for keepAliveTime
                new LinkedBlockingQueue<>() // work queue
        );

        // Submit tasks to the ThreadPoolExecutor
        for (int i = 1; i <= 5; i++) {
            String taskName = "Task " + i;
            executor.submit(() -> {
                System.out.println(taskName + " is running on thread " + Thread.currentThread().getName());
                // Simulate some task execution
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(taskName + " completed.");
            });
        }

        // Shutdown the executor to gracefully terminate the threads
        executor.shutdown();

        try {
            // Wait for all tasks to complete or for the specified timeout
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                // If not all tasks completed, force shutdown
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
