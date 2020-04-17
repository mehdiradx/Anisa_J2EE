package sample2;

/**
 * Created by asus on 2019/12/14.
 */
public class Main {
    public static void main(String[] args) {

        MashtiHassan mashtiHassan1=(x,y)->
        {
            System.out.println(x+" "+y);
        };

        mashtiHassan1.jahanGard("mashad",200);

        System.out.println("==============================");

        Pride pride=new Pride();


        MashtiHassan mashtiHassan2=pride::tormoz;

        mashtiHassan2.jahanGard("shiraz",1000000);






    }
}
