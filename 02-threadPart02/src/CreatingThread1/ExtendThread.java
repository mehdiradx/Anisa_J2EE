package CreatingThread1;

// Create a second thread by extending Thread
class NewThread2 extends Thread {
    public NewThread2() {
// Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start(); // Start the thread
    }

    public void khodamoKhodet()
    {
        System.out.println("baham");
    }

    // This is the entry point for the second thread.
    public void run() {
        khodamoKhodet();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                System.out.println(Thread.currentThread().getName());
                if (Thread.currentThread().getName().equals("Demo Thread"))
                {
                    System.out.println("ba manam are??!!!");
                }
                else
                {
                    System.out.println("ba Main are??!!!");
                    Thread.sleep(500);
                }

            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
class ExtendThread {
    public static void main(String args[]) {
//        new NewThread2(); // create a new thread
//        new NewThread2().run(); // create a new thread
//        new NewThread2().khodamoKhodet();
//        try {
//            for(int i = 5; i > 0; i--) {
//                System.out.println("Main Thread: " + i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted.");
//        }

        NewThread2 thread2=new NewThread2();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("Main thread exiting.");
    }
}