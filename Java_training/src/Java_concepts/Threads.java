<<<<<<< HEAD
package Java_concepts;

/*
 Here we are showing the concept of Multithreading.Here we are defining one class and 
 a thread using Runnable interface Both threads print messages .
 The main thread initiates these threads and finishes its execution afterward.
 */
class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread running");
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
        System.out.println("MyThread finished");
    }
}

public class Threads {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        MyThread myThread = new MyThread();
        myThread.start(); 

        // Another thread using Runnable interface
        Thread runnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("RunnableThread running");
                for (int i = 0; i < 5; i++) {
                    System.out.println("RunnableThread: " + i);
                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        System.out.println("RunnableThread interrupted");
                    }
                }
                System.out.println("RunnableThread finished");
            }
        });
        runnableThread.start(); 

        System.out.println("Main thread finished");
    }
}

=======
package Java_concepts;

/*
 Here we are showing the concept of Multithreading.Here we are defining one class and 
 a thread using Runnable interface Both threads print messages .
 The main thread initiates these threads and finishes its execution afterward.
 */
class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread running");
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
        System.out.println("MyThread finished");
 
    }
}

public class Threads {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        MyThread myThread = new MyThread();
        myThread.start(); 

        // Another thread using Runnable interface
        Thread runnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("RunnableThread running");
                for (int i = 0; i < 5; i++) {
                    System.out.println("RunnableThread: " + i);
                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        System.out.println("RunnableThread interrupted");
                    }
                }
                System.out.println("RunnableThread finished");
            }
        });
        runnableThread.start(); 

        System.out.println("Main thread finished");
    }
}

>>>>>>> 993e728c6925ff6f35c145acc643240027a3c0d8
