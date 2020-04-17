package sample2;

/**
 * Created by asus on 2019/12/14.
 */

@FunctionalInterface
public interface MashtiHassan {


    public void jahanGard(String a,int b);

    public default void khanade()
    {
        System.out.println("khastim o nashod");
    }

    public static void footbalist()
    {
        System.out.println("in dge omran");
    }


}
