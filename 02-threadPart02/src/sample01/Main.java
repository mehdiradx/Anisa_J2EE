package sample01;

/**
 * Created by asus on 2019/11/15.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {





        Thread thread=Thread.currentThread();
        thread.setName("hashem");
        thread.setPriority(10);
        System.out.println(thread);


        Riyazi riyazi=new Riyazi(2,4);
        riyazi.run();


        Thread thread01=new Thread(riyazi,"tik");
        Thread thread02=new Thread(riyazi,"tak");

        thread01.setPriority(Thread.MAX_PRIORITY);
        thread01.start();
        thread02.start();

        thread01.join();


        riyazi.divide(8);

        System.out.println(thread.isAlive());



        System.out.println(thread.isAlive());
        System.out.println("main thread exit");
    }

}
