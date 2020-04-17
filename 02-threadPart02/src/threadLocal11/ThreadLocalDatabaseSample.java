package threadLocal11;

/**
 * Created by asus on 2019/11/22.
 */

class ConnectDb implements Runnable{

    ThreadLocal<String> username=new ThreadLocal<String>();

    public ConnectDb() {

    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Troot"))
            this.username.set("root");




    }
}

public class ThreadLocalDatabaseSample {

    public static void main(String[] args) {


        ConnectDb connectDb=new ConnectDb();
        Thread thread1=new Thread(connectDb,"Troot");
        Thread thread2=new Thread(connectDb,"Tuser");

        thread1.start();
        thread2.start();





    }


}
