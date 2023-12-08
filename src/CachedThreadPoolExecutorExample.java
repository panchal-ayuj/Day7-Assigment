// Java Program to demonstrate FixedThreadPoolExecutor

// Importing required libraries
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Main class
public class CachedThreadPoolExecutorExample {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of ExecutorService for
        // asking the executor service to create a thread
        // pool with fixed number of threads
        ExecutorService service
                = Executors.newCachedThreadPool();

        // Creating 5 threads using loops
        for (int i = 0; i < 5; i++) {

            // Submitting task to service's execute method
            service.execute(() -> {
                // Printing and display the current thread
                // using curentThread() and getName() method
                System.out.println(
                        "Printing document by thread : "
                                + Thread.currentThread().getName());

                // Try block to check for exceptions
                try {

                    // Making threads to sleep for 1 second
                    // using the sleep() method
                    Thread.sleep(1000L);
                }

                // Catch block to handle the exceptions
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
