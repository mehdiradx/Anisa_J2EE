package threadLocal11;

class NewThread2 extends Thread
{
    private static ThreadLocal tlocal = new ThreadLocal()
    {
        protected Object initialValue()
        {
            return new Integer(b++);
        }
    };
    private static int a = 5;
    private static int b=3;
    NewThread2(String name)
    {
        super(name);
        start();
    }
    public void run()
    {
        for(int i = 0; i < 2; i++)
            System.out.println (getName() + " " + tlocal.get());
    }
}
public class ThreadLocalInitialValExp
{
    public static void main (String [] args)
    {
        NewThread2 t1 = new NewThread2("task1");
        NewThread2 t2 = new NewThread2("task2");
    }
}
