package threadLocal11;

/**
 * Created by asus on 2019/08/16.
 */
public class ThreadLocal1 {

    public static void main(String[] argv) throws Exception {

        ThreadLocal localThread = new ThreadLocal();
        Object o = localThread.get();
        localThread.set(o);

    }


}
