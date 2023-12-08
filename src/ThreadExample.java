// Java Program to Test Threads

// Importing required packages
import java.io.*;
import java.util.*;

// Main class
// to test the threads
public class ThreadExample {

    // Main driver method
    public static void main(String[] args) throws InterruptedException {

        // Creating 100 threads and passing an instance
        // of Runnable implementation
        for (int i = 0; i < 100; i++) {

            // Creating object of Thread class
            Thread thread = new Thread(() -> {
                // Printing and display the current thread
                // using curentThread() and getName() method
                System.out.println(
                        "Printing document by thread : "
                                + Thread.currentThread().getName());

                // Try block to check for exceptions
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException e) {
                    // Print the line number where exception
                    // occurred
                    e.printStackTrace();
                }
            });

            // Starting the threads using start() method
            thread.start();
//            thread.join();
        }
    }
}
