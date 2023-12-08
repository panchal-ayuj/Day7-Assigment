// Java Program to demonstrate FixedThreadPoolExecutor

// Importing required libraries
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Main class
public class FixThreadPoolExecutorExample {
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of ExecutorService for
        // asking the executor service to create a thread
        // pool with fixed number of threads
        ExecutorService service
                = Executors.newFixedThreadPool(2    );
        // Creating 100 threads using loops
        for (int i = 0; i < 100; i++) {
//            MyThread th = new MyThread(i);
            // Submitting task to service's execute method
            service.submit(() -> {
                // Printing and display the current thread
                // using curentThread() and getName() method
                System.out.println(
                        "Printing document by thread : "
                                + Thread.currentThread().getName());

                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException e) {
                    // Print and display the line number
                    // where the exception occurred
                    e.printStackTrace();
                }
            });
        }

        // In order to avoid further coming execution of
        // tasks shutdown() method is used
        service.shutdown();
    }
}
