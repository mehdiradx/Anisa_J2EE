package sample01;

/**
 * Created by asus on 2019/11/15.
 */
public class Riyazi implements Runnable {

    public int a;
    public  int b;
    public Thread thread;

    public Riyazi(int a, int b) {

//        thread=new Thread(this,"riyazi thread");
//        thread.start();

        if (b==0)
            throw new ArithmeticException("sefr nade");

        this.a = a;
        this.b = b;
    }

    public Riyazi() {
    }

    public int sum(int a,int b)
    {
        return a+b;
    }

    public int divide(int a)
    {
        return a/this.b;
    }


    @Override
    public void run() {
//        System.out.println(Thread.currentThread());
        System.out.println(divide(this.a));

        for (int i = 0; i <10 ; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                if (Thread.currentThread().getName().equals("tak"))
                    this.a++;

                if (Thread.currentThread().getName().equals("tik"))
                {
                    System.out.println("a baraye tik shode:"+this.a);
                    if (a>4)
                        a=0;

                }



                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
