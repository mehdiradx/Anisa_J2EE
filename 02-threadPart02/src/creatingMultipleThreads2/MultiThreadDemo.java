package creatingMultipleThreads2;

import java.io.InputStream;
import java.io.OutputStream;

// Create multiple threads.
class NewThread implements Runnable {
    String name; // name of thread
    Thread t;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }
    // This is the entry point for thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

class ThreadGoli extends Thread
{
    public String tName;

    public ThreadGoli(String tName) {
        this.tName=tName;
        this.start();
        ThreadGoli.currentThread().setName("goli");

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


class MultiThreadDemo {
    public static void main(String args[]) {

//        new NewThread22("One"); // start threads
//        new NewThread22("Two");
//        new NewThread22("Three");

        new ThreadGoli("goli");


//        try {
//// wait for other threads to end
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            System.out.println("Main thread Interrupted");
//        }
        System.out.println("Main thread exiting.");
    }
}
