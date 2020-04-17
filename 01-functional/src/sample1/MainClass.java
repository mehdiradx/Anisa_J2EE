package sample1;

/**
 * Created by asus on 2019/12/14.
 */
public class MainClass {
    public static void main(String[] args) {


        MashtiHassan mashtiHassan=new MashtiHassan() {
            @Override
            public void jahanGard() {
                System.out.println("antaliye");
            }
        };


        MashtiHassan  mashtiHassan1=()->{
            System.out.println("bakoo");
        };

        MashtiHassan mashtiHassan2=Pride::farmoon;
        mashtiHassan2.jahanGard();


//        mashtiHassan1.jahanGard();

        Pride prideAziz=new Pride();

        MashtiHassan mashtiHassan3=prideAziz::tormoz;
        mashtiHassan3.jahanGard();

        Masalan masalan1=new Masalan();
        masalan1.mesleInke(()->{
            System.out.println("baraye inek");
        });








    }

}
